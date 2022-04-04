package com.java.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Number of non space character is "+ numberNonSpaceCharacter(input));
        if (input.length()>3){
            System.out.println("Third character of input is "+input.charAt(2));
        }else{
            System.out.println("undefined");
        }
        String s1 = "concatencatiocatn";
        String s2 = "cat";
        containString(s1,s2);
        String s3 = "sfodAl ukJj2232 @*2";
        countCharacter(s3);
        String s4 = "Tone of voice id, with a question, for example; to quite quickly";
        String[] words =  s4.split("[ ,;.]+");
        System.out.println("Number of words: "+words.length);
        String s5 = "abcbb   bcca";
        replaceIdenticalCharacter(s5);

    }
    public static void replaceIdenticalCharacter(String input){
        for (int i=0;i<input.length()-1;i++){
            boolean check = true;
            int nextIndex = i+1;
            String ch = String.valueOf(input.charAt(i));
            do{
                if (nextIndex!=input.length()&&input.substring(nextIndex).startsWith(ch)){
                    nextIndex++;
                }else{
                    check = false;
                }
            }while(check);
            input = input.substring(0,i+1) +input.substring(nextIndex);
        }
        System.out.println(input);
    }

    public static int numberNonSpaceCharacter(String input){
        int count =0;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void printReverseString(String input){
        for (int i =input.length()-1;i>=0;i--){
            char temp = input.charAt(i);
            System.out.print(temp);
        }
        System.out.println();
    }
    public static void containString(String s1, String s2){
        if (s1.contains(s2)){
            for (int i=0;i<s1.length();i++){
                if (s1.substring(i).startsWith(s2)){
                    System.out.println("Substring found at position "+(i+1));
                }
            }
        }else {
            System.out.println("Substring not found in the string");
        }
    }
    public static void countCharacter(String input){
        int countNumber=0;
        int countVowel = 0;
        int countConsonant = 0;
        int countSpecial = 0;
        for (int i =0;i<input.length();i++){
            String temp = input.substring(i, i+1);
            if (temp.matches("[0-9]")){
                countNumber++;
            }else if(temp.matches("[a-zA-Z]")){
                if (temp.matches("[aouieAOUIE]")) countVowel++;
                else countConsonant++;
            }else countSpecial++;
        }
        System.out.println("Number of numeral character: "+countNumber);
        System.out.println("Number of vowel character: "+countVowel);
        System.out.println("Number of consonant character: "+countConsonant);
        System.out.println("Number of special character: "+countSpecial);
    }
}
