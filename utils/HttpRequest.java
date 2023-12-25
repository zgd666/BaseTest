package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest{

    public static String sendGet(String urlStr) throws IOException{
        URL url = new URL(urlStr);
        HttpURLConnection con =(HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept","application/json");

        if (con.getResponseCode()!= HttpURLConnection.HTTP_OK){
            throw new IOException("Failed to connect to the server. Error code:"
                    + con.getResponseCode());
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream(),"UTF-8"));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine())!= null){
            response.append(inputLine);
        }
        in.close();
        con.disconnect();

        return response.toString();
    }
}
