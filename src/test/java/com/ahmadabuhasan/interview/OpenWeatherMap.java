package com.ahmadabuhasan.interview;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class OpenWeatherMap {

    @Test
    public void main() {

        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/onecall?&lat=-6.2146&lon=106.8451&exclude=current%2Cminutely%2Chourly%2Calerts&units=metric&appid='paste your API Weather in here'");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (conn.getResponseCode() == 200) {
                Scanner scan = new Scanner(url.openStream());
                while (scan.hasNext()) {
                    String temp = scan.nextLine();
                    //parse json here
                    System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(temp)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
