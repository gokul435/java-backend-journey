import java.util.Arrays;
import java.util.Scanner;

public class OccurenceInArray {
    public static void main(String [] args){

        int [] arr = {1,2,3,4,2,2,3,3,2,2};
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count : ");
        int targetNum = sc.nextInt();

        int count = 0;
        for(int x : arr){
            if(targetNum == x){
                count++;
            }
        }
        System.out.println(targetNum + " appears " +
                "" + count + " times.");

    }
}
