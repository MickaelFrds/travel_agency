package fr.lernejo.travelsite;

import retrofit2.*;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface PredictionEngineClient {
        @GET("/api/temperature")
        Call<ListTemperature> listTemperatureCall(@Query("country") String country);
    }

