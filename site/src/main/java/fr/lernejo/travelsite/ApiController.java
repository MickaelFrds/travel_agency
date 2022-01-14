package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;


@RestController
public class ApiController {

    final public PredictionEngineClient predictionEngineClient = new Launcher().predictionEngineClient();
    final public ServiceApp serviceApp = new ServiceApp(this.predictionEngineClient);

    @PostMapping("/api/inscription")
    public Iterable<Inscription> addInscription (@RequestBody Inscription user){
       return serviceApp.Inscription_client(user);
    }


    @GetMapping( "/api/travels")
    public ArrayList<Travels> getTravels(@RequestParam  String userName ) {
        ListTravels list = new ListTravels();
        list.listTravels.add(new Travels("Portugal", 22));
        return list.listTravels;
    }
}
