package com.arthur;

import com.hello.Animal;
import com.hello.Fraction;
import com.hello.Student;

public class ClassAndObject {
    public static void main(String[] args){
        Animal myAnimal = new Animal("yellow","domestic",10,"Ly Ly");
        Animal myAnimalX = new Animal();
        myAnimal.displayInformation();
        System.out.println(myAnimal.name);
        System.out.println(myAnimal.getColor());
        myAnimal.setWeight(-4);
        System.out.println(myAnimal.getWeight());
        Animal myAnimal2 = new Animal("black","domestic",4,"Ly La");
        Animal myAnimal3 = new Animal("white","domestic",10,"Helolo");
        int c   = 5, d = 7;
        swap(c,d);
        System.out.println("c = "+c);
        changeColor(myAnimal3);
        System.out.println(myAnimal3.getColor());
        Student student1 = new Student("Nam", 7, 8, 9);
        System.out.println(Student.getNumberOfStudent());
        Student student2 = new Student("Hoa", 10, 6, 9);
        System.out.println(Student.getNumberOfStudent());
        Student student3 = new Student("Lan", 3, 5, 4);
        System.out.println(Student.getNumberOfStudent());
        Student student4 = new Student("Hung", 10, 8, 9);
        System.out.println(Student.getNumberOfStudent());
        Student[] myStudentArray = new Student[4];
        myStudentArray[0] = student1;
        myStudentArray[1] = student2;
        myStudentArray[2] = student3;
        myStudentArray[3] = student4;
        System.out.printf("%-15s %-15s%-15s\n","Name","Average Score","Classification");
        for (int i= 0;i<myStudentArray.length;i++){
            myStudentArray[i].displayInformation();

        }
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(6 , 10);
        System.out.println(f1 + "+"+ f2 +"=" +(f1.add(f2)));
        f1.display();
    }
    public static void changeColor(Animal animal){
        animal.setColor("Pink");
    }

    public static void swap(int a, int b){
        int c = a;
        a = b;
        b = c;
    }
}
