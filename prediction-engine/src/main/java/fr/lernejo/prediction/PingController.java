package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping(path = "/api/ping")
    String ping() {
        return "OK";
    }

    @GetMapping( "/api/temperature?country={country}")
    public Temperature getTemperature(@RequestBody Temperature ListTempOfCountry) {
        return ListTempOfCountry;
    }
}
