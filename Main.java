package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\alexa\\IdeaProjects\\URLTest.TXT");
        Aviable av = new Aviable();
        LineReader lr = new LineReader();
        try {
            String str = lr.getStringFromFile(file);
            av.check(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
