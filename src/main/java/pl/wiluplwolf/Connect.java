package pl.wiluplwolf;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class responsible for connecting to API
 */

class Connect {
    private HttpURLConnection connection;
    private URL url;

    // Constructor responsible for connecting to provided URL
    Connect(String connetingUrl) {
        try {
            url = new URL(connetingUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            var responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Response code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public URL getUrl() {
        return url;
    }
}
