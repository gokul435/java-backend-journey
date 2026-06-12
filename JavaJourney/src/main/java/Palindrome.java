import java.util.Scanner;

public class Palindrome {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int original = sc.nextInt();             //use this for compare and make copy then used num in loop
        int num = original;
        int revNum = 0;

        while(num >0){
            int lastDigit = num%10;  //121%10 = 1
            revNum = (revNum*10) + lastDigit ; //1
            num = num/10; //121/10 = 12

        }
        if(original == revNum){
            System.out.println(revNum + " is palindrome");
        }
        else {
            System.out.println(revNum + " is not a palindrome");
        }
    }

}
