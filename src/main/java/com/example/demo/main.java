package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class main {
    public static void main () throws IOException{
        String url = "http://localhost:8080/logowanie";
        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "test");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputline;
        StringBuffer odpowiedz = new StringBuffer();
        while((inputline=in.readLine())!=null){
            odpowiedz.append(inputline);
        }

        odpowiedz.toString();

    }
}
