package fr.lernejo.travelsite;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


@Service
public class ServiceApp {

    final public PredictionEngineClient predictionEngineClient;
    final public ListTravels listTemperaturesCountries;
    final public ArrayList<Inscription> users;

    ServiceApp(PredictionEngineClient predictionEngineClient){
        this.predictionEngineClient = predictionEngineClient;
        this.listTemperaturesCountries =new ListTravels();
        this.users = new ArrayList<>();
    }

    public Iterable<Inscription> Inscription_client(Inscription user){
        if(!this.users.contains(user))this.users.add(user);
        return users;
    }

    public List<String> ReadFileTxt() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("countries.txt");
        if (inputStream == null) throw new AssertionError();
        String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        Stream<String> lines = content.lines();
        return  lines.toList();
    }

    public Object get_mean_temp(String country) throws IOException {
        Call<ListTemperature> listTemperatureCountry = this.predictionEngineClient.listTemperatureCall(country);
        if (listTemperatureCountry != null){
            Response<ListTemperature> rep  = listTemperatureCountry.execute();
            if (rep.body() == null) throw new AssertionError();
            Number moy = (rep.body().temperatures.get(0).temperature.doubleValue() + rep.body().temperatures.get(1).temperature.doubleValue())/2;
            listTemperaturesCountries.listTravels.add(new Travels(country,moy));
            return  listTemperaturesCountries.listTravels;
        }
        return null;
    }
}
