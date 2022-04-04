package com.java.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args){
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Hello");
        listString.add("Hello");
        listString.add("Good");
        listString.add("Welcome");
        listString.add("School");
        listString.add("Bad");
        listString.add("University");
        removeEvenLength(listString);
        doubleList(listString);
        removeDuplicates(listString);
        for(String temp: listString){
            System.out.println(temp);
        }
    }
    public static void doubleList(ArrayList<String> list){
        for (int i=0;i<list.size();i+=2){
            list.add(i,list.get(i));
        }
    }
    public static void removeEvenLength(ArrayList<String> list){
        for (int i=0;i<list.size();i++){
            if (list.get(i).length()%2==0){
                list.remove(i);
                i--;
            }
        }
    }
    public static void removeDuplicates(ArrayList<String> list){
        for (int i=0;i<list.size()-1;i++){
            if (list.get(i).equals(list.get(i+1))){
                list.remove(i);
                i--;
            }
        }
    }
}
