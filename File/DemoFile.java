package com.java.file;

import com.hello.Animal;
import com.hello.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoFile {
    public void output(String a) throws IOException{
        System.out.println(a);
        File outFile = new File("./src/com/java/file/data5.txt");
        FileOutputStream outputStream = new FileOutputStream(outFile);
        PrintStream writer = new PrintStream(outputStream);
        writer.println(a);
    }
    public static void main(String [] args){
        try{
           writeObjectToFile();
           readObjectFromFile();
        }catch(IOException e){
            System.out.println(e.getClass()+e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getClass()+e.getMessage());
        }

    }
    public static void writeFileLowLevel() throws IOException {
        File outFile = new File("data.txt");
        FileOutputStream outputStream = new FileOutputStream(outFile);
        byte[] bytesArray = {40, 70, 100, 12, 90};
        outputStream.write(bytesArray);
        outputStream.close();
    }
    public static void readFileLowLevel() throws  IOException{
        File inFile = new File("data.txt");
        FileInputStream inputStream = new FileInputStream(inFile);
        int  i =0;
        while((i = inputStream.read())!=-1){
            System.out.println(i);
        }
        inputStream.close();
    }
    public static void writeFileAbsolutePath() throws IOException{
        File outFile = new File("D://data2.txt");
        FileOutputStream outputStream = new FileOutputStream(outFile);
        String text = "Welcome to Java class part 2";
        outputStream.write(text.getBytes());
        outputStream.close();
    }

    public static void writeFileLowLevel2() throws IOException {
        File outFile = new File("./src/com/java/file/data2.txt");
        FileOutputStream outputStream = new FileOutputStream(outFile);
        String text = "Welcome to Java class part 2";
        outputStream.write(text.getBytes());
        outputStream.close();
    }
    public static void readFileLowLevel2() throws  IOException{
        File inFile = new File("./src/com/java/file/data2.txt");
        FileInputStream inputStream = new FileInputStream(inFile);
        int  i =0;
        while((i = inputStream.read())!=-1){
            System.out.print((char)i);
        }
        inputStream.close();
    }
    public static void writeFileHighLevel() throws  IOException{
        File outFile = new File("./src/com/java/file/data3.txt");
        FileOutputStream outputStream = new FileOutputStream(outFile);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeFloat(1111111F);
        dataOutputStream.writeInt(232);
        dataOutputStream.writeChar('a');
        outputStream.close();
    }
    public static void readFileHighLevel()throws  IOException{
        File inFile = new File("./src/com/java/file/data3.txt");
        FileInputStream inputStream = new FileInputStream(inFile);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readFloat());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readChar());
        inputStream.close();
    }
    public static void writeFileWithCharacters()throws  IOException{
        File outFile = new File("./src/com/java/file/data4.txt");
        //FileWriter outputStream = new FileWriter(outFile);
        //PrintWriter writer = new PrintWriter(outputStream);
        FileOutputStream outputStream = new FileOutputStream(outFile);
        PrintStream writer = new PrintStream(outputStream);
        writer.println("hello everyone");
        writer.printf(" %d + %d  = %d",3, 4, 7 );
        outputStream.close();
    }
    public static void readFileWithCharacters() throws IOException{
        File inFile = new File("./src/com/java/file/data4.txt");
        FileReader reader = new FileReader(inFile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
    }
    public static void changeOutput() throws IOException{
        File outFile = new File("./src/com/java/file/data5.txt");
        FileOutputStream outputStream = new FileOutputStream(outFile);
        PrintStream writer = new PrintStream(outputStream);
        System.setOut(writer);
        System.out.println("hello");
        System.out.println("we are trying to change the output");
        System.out.println("from the screen to the file");
        System.out.println("This is the end");
    }
    public static void inputWithScanner( )throws IOException{
        File inFile = new File("./src/com/java/file/data5.txt");
        Scanner sc = new Scanner(inFile);
        int i = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        boolean b = sc.nextBoolean();
        System.out.println(i+ " "+ s+ " "+ b);
    }
    public static void writeObjectToFile() throws IOException{
        File outFile = new File("./src/com/java/file/data6.txt");
        FileOutputStream outputStream = new FileOutputStream(outFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Student myStudent1 = new Student("Arthur", 3 , 5, 6);
        Student myStudent2 = new Student("Lina", 4 , 6, 6);
        Student myStudent3 = new Student("Henry", 4 , 6, 6);
        objectOutputStream.writeObject(myStudent1);
        objectOutputStream.writeObject(myStudent2);
        objectOutputStream.writeObject(myStudent3);
        Animal myAnimal = new Animal("yellow","domestic", 10, "kitty");
        objectOutputStream.writeObject(myAnimal);
        outputStream.close();
    }
    public static void readObjectFromFile() throws IOException, ClassNotFoundException{
        File inFile = new File("./src/com/java/file/data6.txt");
        FileInputStream inputStream = new FileInputStream(inFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ArrayList<Student> myStudentList = new ArrayList<>();
        Student myStudent = (Student)objectInputStream.readObject();
        myStudentList.add(myStudent);
        myStudent = (Student)objectInputStream.readObject();
        myStudentList.add(myStudent);
        myStudent = (Student)objectInputStream.readObject();
        myStudentList.add(myStudent);
        for(Student student:myStudentList){
            student.displayInformation();
        }
        Animal myAnimal = (Animal) objectInputStream.readObject();
        myAnimal.displayInformation();
    }


}
