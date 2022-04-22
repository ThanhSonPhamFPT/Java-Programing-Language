package com.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("./src/com/java/file/data_exercise4.txt");
        FileReader reader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        StringBuilder result = new StringBuilder();
        while((line = bufferedReader.readLine())!=null){
            result.append(" "+ line);
        }
        System.out.println(result);
        reader.close();
    }
}
