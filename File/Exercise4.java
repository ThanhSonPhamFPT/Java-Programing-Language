package com.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("./src/com/java/file/data_exercise4.txt");
        FileReader reader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        int count = 0;
        double sum = 0;
        while((line = bufferedReader.readLine())!=null){
            ++count;
            sum+= Double.parseDouble(line);
        }
        System.out.println("Average grade: "+sum/count);
        reader.close();
    }
}
