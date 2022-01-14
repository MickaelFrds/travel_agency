package fr.lernejo.prediction;

import java.util.ArrayList;

public class ListTemperature {
    final public String country;
    final public ArrayList<TempAndDate> temperatures;

    ListTemperature(String country){
        this.country =country;
        this.temperatures = new ArrayList<>();
    }
}
