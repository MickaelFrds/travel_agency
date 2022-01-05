package fr.lernejo.travelsite;

import retrofit2.*;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PredictionEngineClient {
        @GET("/api/temperature?country={country}")
        Call<ListTemperature> listTemperatureCall(@Path("country") String country);
    }

