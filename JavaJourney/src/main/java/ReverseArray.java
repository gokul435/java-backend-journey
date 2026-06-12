import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args){
        int [] arr = {1,2,4,5,6};
        System.out.println("Before reverse : " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        System.out.println("Before reverse : " + Arrays.toString(arr));
    }
}
