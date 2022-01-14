package fr.lernejo.travelsite;

import java.util.ArrayList;

public class ListTemperature {
    final public String country;
    final public ArrayList<TempAndDate> temperatures;

    public ListTemperature(){
        this.temperatures=null;
        this.country=null;
    }
    public ListTemperature(String country, ArrayList<TempAndDate> temperatures){
        this.country=country;
        this.temperatures=temperatures;
    }
}
