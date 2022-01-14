package fr.lernejo.travelsite;

public class Inscription {
    final public String userEmail;
    final public String userName;
    final public String userCountry;
    final public  WeatherExpectation weatherExpectation;
    final public  int minimumTemperatureDistance;

    public Inscription( String userEmail, String userName, String userCountry, WeatherExpectation weatherExpectation, int minimumTemperatureDistance){
        this.userName=userName;
        this.userEmail=userEmail;
        this.minimumTemperatureDistance=minimumTemperatureDistance;
        this.userCountry=userCountry;
        this.weatherExpectation=weatherExpectation;
    }
    public Inscription( ){
        this.userName=null;
        this.userEmail=null;
        this.minimumTemperatureDistance=0;
        this.userCountry=null;
        this.weatherExpectation=null;
    }
}
