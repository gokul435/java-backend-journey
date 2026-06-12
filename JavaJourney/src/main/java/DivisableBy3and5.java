public class DivisableBy3and5 {
// Start from the 1 instead of 0
    public static void main(String args []){
        for(int i = 0; i<=100; i++){
            if(i%3==0 && i%5==0) {
                System.out.println(i);
            }
        }
    }
}
