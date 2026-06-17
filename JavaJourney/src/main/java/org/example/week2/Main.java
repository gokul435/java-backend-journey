package org.example.week2;

public class Main {
    public static void main(String [] args){

//        Student student1 = new Student("Gokul", 150, 99.0);
//
//        Student student2 = new Student("Dobby", 25, 1000);
//
//        student1.study();
//        student2.study();
//
//        student1.displayInfo();
//        student2.displayInfo();
//    Teacher teacher1 = new Teacher("Dobby", 25, 90000.99);
//
//    teacher1.teach();
//
//    teacher1.displayInfo();

//        Shape s1 = new Circle(32);
//        Shape s2 = new Rectangle(10, 10);
//
//        System.out.println(s1.calculateArea());
//        System.out.println(s2.calculateArea());

        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        bike.stop();

        car.start();
        car.stop();
    }
}
