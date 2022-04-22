package com.java.file;

import java.io.*;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        File inFile = new File("./src/com/java/file/data2.txt");
        FileInputStream inputStream = new FileInputStream(inFile);
        int i = 0;
        while((i = inputStream.read())!=-1){
            System.out.println((char)i);
        }
        inputStream.close();
    }
}
