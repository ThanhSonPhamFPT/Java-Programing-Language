package com.java.file;

import java.io.*;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("./src/com/java/file/data4.txt");
        FileReader reader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        File outFile = new File("./src/com/java/file/data4_copy.txt");
        FileWriter outputStream = new FileWriter(outFile);
        PrintWriter writer = new PrintWriter(outputStream);
        String line;
        int count = 1;
        while((line = bufferedReader.readLine())!=null){
            writer.println((count++) +". "+line);
        }
        outputStream.close();
        reader.close();
    }

}
