import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println("Enter the count : ");
        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<totalNum-2; i++){

            c = a+b;  //0+1 = 1
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
