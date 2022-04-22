package com.java.file;

import java.io.*;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("./src/com/java/file/data_exercise6.txt");
        FileReader reader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        int count = Integer.parseInt(bufferedReader.readLine());
        reader.close();
        File outFile = new File("./src/com/java/file/data_exercise6.txt");
        FileWriter outputStream = new FileWriter(outFile);
        PrintWriter writer = new PrintWriter(outputStream);
        count++;
        writer.print(count);
        outputStream.close();

    }
}
