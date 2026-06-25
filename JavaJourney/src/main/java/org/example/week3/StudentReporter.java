package org.example.week3;

import java.util.*;
import java.util.stream.Collectors;

public class StudentReporter {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Top Performers (marks > 80)");
            System.out.println("4. Failed Students (marks < 50)");
            System.out.println("5. Average Marks");
            System.out.println("6. Highest Scorer");
            System.out.println("7. Exit");

            System.out.println("Please enter your option : ");
            int option = sc.nextInt();
            if(option == 1){
                System.out.println("Enter the name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter the age : ");
                int age = sc.nextInt();
                double marks = 0;
                try {
                    System.out.println("Enter the marks : ");
                    marks = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Invlid input.....");
                    throw new RuntimeException(e);
                }
                Student student = new Student(name, age, marks);
                students.add(student);
                System.out.println("Added successfully.....");
            }
            else if(option ==2){
                if(students.isEmpty()){
                    System.out.println("Students are not yet added....");
                }
                else{
                    students.stream().forEach(System.out::println);
                }
            }
            else if(option ==3){
                List<Student> topPrf = students.stream().filter(s ->s.marks() > 80).collect(Collectors.toList());
                if(topPrf.isEmpty()){
                    System.out.println("No topPerformers or students not yet added.....");
                }
                else{
                    if(topPrf.size()>1){
                        System.out.println("Top Performers are :");
                        topPrf.forEach(System.out::println);
                    }
                    else{
                        System.out.println("The Only Performer is :");
                        topPrf.forEach(System.out::println);
                    }
                }
            }
            else if(option==4){
                List<Student> failStu = students.stream().filter(s ->s.marks() < 50).collect(Collectors.toList());
                if(failStu.isEmpty()){
                    System.out.println("No failed students or students not yet added.....");
                }
                else{
                    if(failStu.size()>1){
                        System.out.println("Failed students are :");
                        failStu.forEach(System.out::println);
                    }
                    else{
                        System.out.println("The Only failed student is :");
                        failStu.forEach(System.out::println);
                    }
                }
            }
            else if(option==5){
                OptionalDouble avg = students.stream().mapToDouble(s -> s.marks()).average();
                System.out.println("Average is : " + avg.orElse(0.0));
            }
            else if(option==6){
                Optional <Student> highestMark = students.stream().max(Comparator.comparingDouble(Student::marks));
                if(highestMark.isPresent()){
                    System.out.println("The top scorer is : " + highestMark.get());
                }
                else{
                    System.out.println("No students added.....");
                }
            }
            else if(option==7){
                System.out.println("Thanks for using this application.....");
                break;
            }
            else{
                System.out.println("Invalid option please try again.....");
            }
       }

    }
}
