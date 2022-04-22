package com.java.file;

import java.io.*;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("./src/com/java/file/data4.txt");
        FileReader reader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        int count = 0;
        while((line = bufferedReader.readLine())!=null){
            ++count;
        }
        System.out.println("There is "+count+ " lines");
        reader.close();
    }
}
