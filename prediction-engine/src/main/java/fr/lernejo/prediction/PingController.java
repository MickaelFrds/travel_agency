package fr.lernejo.prediction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PingController {



    @GetMapping(path = "/api/ping")
    String ping() {
        return "OK";
    }

    @GetMapping( "/api/temperature")
    public @ResponseBody Object getTemperature(@RequestParam String country) {
        try{
            TemperatureService temperatureService = new TemperatureService();
            ListTemperature listTempOfCountry = new ListTemperature(country);
            listTempOfCountry.temperatures.add(new TempAndDate(temperatureService.getTemperature(country), "2022-01-04"));
            listTempOfCountry.temperatures.add(new TempAndDate(temperatureService.getTemperature(country), "2022-01-05"));
            return listTempOfCountry;
        }catch (UnknownCountryException e){
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }

    }
}
