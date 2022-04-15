package com.java.polymorphism;

public class PersonList {
    public static final int SIZE = 100;
    private Person[] myPersonList;
    private int nbPeople;

    public PersonList() {
        this.myPersonList = new Person[SIZE];
        nbPeople = 0;
    }
    public void displayAll(){
        for (int i =0;i<nbPeople;i++){
            myPersonList[i].display();
        }
    }
    public void displayAll(int rank){
        for (int i =0;i<nbPeople;i++){
            if (myPersonList[i].getRank()==rank)
            myPersonList[i].display();
        }
    }
    public void add(Person p){
        if (nbPeople == SIZE) System.out.println("List is full! Can not add");
        else {
            myPersonList[nbPeople] = p;
            nbPeople++;
        }
    }
    public double average(){
        int sum = 0;
        for (int i =0;i<nbPeople;i++){
            sum+=myPersonList[i].getRank();
        }
        return (double)sum/nbPeople;
    }
    public Person maxRank(){
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i =0;i<nbPeople;i++){
            if (myPersonList[i].getRank() >= max) {
                index = i;
            }
        }
        return myPersonList[index];
    }
    public void removePerson(String code){
        int index = -1;
        for (int i =0;i<nbPeople;i++){
            if (myPersonList[i].getCode().equals(code)) {
                index = i;
                break;
            }
        }
        if (index==-1){
            System.out.println("There is no people in the list with the code "+code);
        }else{
            for (int i = index;i<nbPeople-1;i++){
                myPersonList[i] = myPersonList[i+1];
            }
            nbPeople--;
        }
    }
}
