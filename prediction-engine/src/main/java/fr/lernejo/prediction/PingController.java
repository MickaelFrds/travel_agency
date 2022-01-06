package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.*;

@RestController
public class PingController {



    @GetMapping(path = "/api/ping")
    String ping() {
        return "OK";
    }

    @GetMapping( "/api/temperature")
    public ListTemperature getTemperature(@RequestParam String country) {
        TemperatureService temperatureService = new TemperatureService();
        ListTemperature listTempOfCountry = new ListTemperature(country);
        listTempOfCountry.temperatures.add(new TempAndDate(temperatureService.getTemperature(country), "2022-01-04"));
        listTempOfCountry.temperatures.add(new TempAndDate(temperatureService.getTemperature(country), "2022-01-05"));
        return listTempOfCountry;
    }
}
