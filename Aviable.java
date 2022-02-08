package com.company;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class Aviable {
    public static boolean accessibility(String spec) throws IOException{
        boolean status = false;
            URL url = new URL(spec);
            HttpURLConnection check = (HttpURLConnection) url.openConnection();
            int code = check.getResponseCode();

            if (code == 200) {
                status = true;
            }

        return status;
    }

    public void check(String str) throws IOException {
        String[] array = str.split("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            boolean check = accessibility(array[i]);
            if (check) {
                System.out.println("доступен");
            } else {
                System.out.println("не доступен");
            }
        }
    }

    public Aviable() {
    }
}

