package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ApiController {

    public final ArrayList<Inscription> ListInscription = new ArrayList<>() ;

    @PostMapping("/api/inscription")
    public void addInscription (@RequestBody Inscription user){
    ListInscription.add(user);
    }

    @GetMapping("/api/travels?userName={userName}")
    public ListTravels getTravels(@RequestBody ListTravels list){
        return list;
    }



    }
}
