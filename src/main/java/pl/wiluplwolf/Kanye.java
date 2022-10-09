package pl.wiluplwolf;

import java.util.Scanner;

/**
 * Class for obtaining a sentences from API
 */
class Kanye {
    private Connect connection;
    private Scanner sc;
    private StringBuilder responseString;

    Kanye(Connect connection) {
        this.connection = connection;
    }

    // This method getting sentence from API
    private StringBuilder getResponseString() {
        responseString = new StringBuilder();
        try {
            sc = new Scanner(connection.getUrl().openStream());
            while (sc.hasNext()) {
                responseString.append(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseString;
    }

    // This method convert obtained sentence to String without unnecessary characters
    public String nextWest() {
        String result = String.valueOf(getResponseString());
        return result.substring(10, result.length() - 2);
    }
}
