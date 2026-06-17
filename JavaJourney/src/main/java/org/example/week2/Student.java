package org.example.week2;

public class Student {
    private String name;
    private int age;
    private double marks;

    // Setters
    void setName(String name){
        this.name =name;
    }

    void setAge(int age){
        if(age >0 && age <=120){
            this.age =age;
        }
        else{
            System.out.println("Invalid input.....");
        }
    }

    void setMarks(double marks){
        if(marks>=0 && marks<=100){
            this.marks =marks;
        }
        else{
            System.out.println("Invalid input.....");
        }
    }

    String getName(){
        return this.name;
    }

    //setters
    int getAge(){
        return this.age;
    }

    double getMarks(){
        return this.marks;
    }


    //constructor
    public Student(String name, int age, double marks){
        setName(name);
        setAge(age);
        setMarks(marks);
    }


    //Methods
    public void study(){
        System.out.println(name  + " is studying");
    }

    public void displayInfo(){
        System.out.println("Name: " +name);
        System.out.println("Age :" + age);
        System.out.println("Mark :" + marks);
    }
}
