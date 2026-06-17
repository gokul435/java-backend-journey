package org.example.week1;

import java.util.Scanner;

public class AreaCircle {

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :  ");
        double rad = sc.nextDouble();

        double radius = (3.14 * rad * rad);

        System.out.println("Your S.I is : " + radius);
    }
}
