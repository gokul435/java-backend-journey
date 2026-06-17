package org.example.week1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month :  ");
        int month = sc.nextInt();


        String season = switch(month) {
            case 1,2,12 -> "Winter";
            case 3,4,5 -> "Spring";
            case 6,7,8 -> "Summer";
            case 9,10,11 -> "Autumn";
            default -> "Other season";
        };
        System.out.println(season);

    }
}
