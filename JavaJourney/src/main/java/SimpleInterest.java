import java.util.Scanner;

public class SimpleInterest {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest ");

        System.out.println("Enter the Principal Amount : ");
        float prin = sc.nextFloat();

        System.out.println("Enter the Interest Rate : ");
        float rate = sc.nextFloat();

        System.out.println("Enter the Time : ");
        float time = sc.nextFloat();

        float simpleInterest = ((prin * rate * time)/100);

        System.out.println("Your S.I is : " + simpleInterest);

    }
}
