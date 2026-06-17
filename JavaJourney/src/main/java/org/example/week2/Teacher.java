package org.example.week2;

public class Teacher extends Person{
        protected double salary;

        public Teacher(String name, int age, double salary){
            super(name, age);
            this.salary = salary;
        }


        void teach(){
            System.out.println(name + " is teaching.");
        }


        @Override
        void displayInfo(){
            System.out.println("Salary :" + salary);
            super.displayInfo();
        }

}
