import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class ExchangeRateService {

    private static final String API_KEY = "fca_live_kZc93D25SEBHk8d7Cbx1NmLUG6DrL1Th2rpzZIBT";
    private static final String BASE_URL = "https://api.freecurrencyapi.com/v1/latest";

    public static double getExchangeRate(String fromCurrency, String toCurrency) {
        try {
            // Construct the request URL
            String urlString = String.format("%s?apikey=%s&base_currency=%s", BASE_URL, API_KEY, fromCurrency);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse the JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                // Assuming the API returns a "data" object containing currency rates
                JSONObject rates = jsonResponse.getJSONObject("data");
                if (rates.has(toCurrency)) {
                    return rates.getDouble(toCurrency);
                } else {
                    System.out.println("Currency not found in response");
                }
            } else {
                System.out.println("GET request not worked: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1; // Indicate failure or currency not found
    }
}
