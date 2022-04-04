package com.java.collection;

import com.arthur.Point.Point;

import java.util.*;

public class CollectionClasses {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String greet = "Welcome";
        char[] charArray = {'d', 'o','w','n'};
        System.out.println(greet.charAt(4));
        String myString = new String(charArray);
        String myString2 = new String("Welcome");
        System.out.println(greet == "Welcome");
        System.out.println(greet.equals(myString2));
        int count = 0;
        for (int i =0;i<greet.length();i++){
            char temp = greet.charAt(i);
            if (temp == 'a' || temp == 'e' ||temp == 'i' ||temp == 'o' ||temp == 'u' ||
                    temp == 'A' || temp == 'E' ||temp == 'I' ||temp == 'O' ||temp == 'U'){
                count++;
            }
        }
        System.out.println(greet + " has " + count + " vowels");
        for (int i =greet.length()-1;i>=0;i--){
            char temp = greet.charAt(i);
            System.out.print(temp);
        }
        System.out.println();
        String value = "  hello   ";
      //  System.out.println("The game contains "+ count(value,sc) + " "+value);
        //Examples of compareTo
        System.out.println(value.compareTo(greet));
        System.out.println(value.compareToIgnoreCase(greet));
        System.out.println(value.substring(1));
        System.out.println(value.substring(1,4));
       // value = value.substring(0,1).toUpperCase() + value.substring(1);
        //value.substring(0,1).toUpperCase();
        System.out.println(value);
        System.out.println(value.trim());
        double x = 2334.564;
        String temp = String.valueOf(x);
        System.out.println(temp);
        System.out.println(value.replaceAll("[aeiou]","@"));
        System.out.println(greet.replaceAll("[aeiou]","|"));
        StringBuilder myStringBuilder = new StringBuilder("Hello World");
        myStringBuilder.append("Good morning");
        System.out.println(myStringBuilder);
        int[] array ={2, 4, 6, 4, 3, 4};
        array = new int[10];
        for (int val:array){
            System.out.println(val);
        }
        for (char val:value.toCharArray()){
            System.out.println(val);
        }
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("Welcome");
        listString.add("Goodbye");
        listString.add("School");
        listString.add("University");
        for(int i=0;i<listString.size();i++){
            System.out.println(listString.get(i));
        }
        listString.remove(1);
        for (String i: listString){
            System.out.println(i);
        }
        HashMap<String,Integer> countMap = new HashMap<>();
        String line = "Hello every one I want to say hello to you abcd to hello morning";
        String[] words = line.split(" ");
        for (int i=0;i<words.length;i++){
            if (countMap.containsKey(words[i])){
                countMap.put(words[i],countMap.get(words[i])+1);
            }else{
                countMap.put(words[i],1);
            }
        }
        System.out.println("to appears "+ countMap.get("to")+ " times");
    }

    public static int count(String value, Scanner sc){
        int count = 0;
        String word="";
        do{
            System.out.print("Next word:");
            word = sc.next();
            if (word.equalsIgnoreCase(value)){
                count++;
            }

        }while(!word.equals("STOP"));
        return count;
    }
}
