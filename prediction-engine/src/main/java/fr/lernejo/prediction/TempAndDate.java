package fr.lernejo.prediction;

import java.util.Date;

public class TempAndDate {
    final public String date;
    final public Number temperature;


    TempAndDate(Number temperature,String date){
        this.date = date;
        this.temperature = temperature;
    }
}
