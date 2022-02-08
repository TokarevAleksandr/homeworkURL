package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LineReader {
    public String getStringFromFile(File file) throws IOException {
        String str = "";
        Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                str += sc.nextLine() + System.lineSeparator();
            }

            return str;
        }
    }
