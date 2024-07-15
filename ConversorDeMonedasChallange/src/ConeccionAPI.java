import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConeccionAPI {
    public static void soliciud(String base, String target, double value ) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);

        String direccion = "https://v6.exchangerate-api.com/v6/cc66059a1293dac6ffc561a1/pair/" + base + "/" + target + "/" + value;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();


        Gson gson = new Gson();
        ConversionMoneda moneda = gson.fromJson(json, ConversionMoneda.class);


        moneda.setValue(Double.valueOf(value));
        moneda.mostrarMonedas();

    }
}
