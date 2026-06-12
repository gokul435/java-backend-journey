public class LargestNumInArray {
    public static void main(String [] args) {
        int[] array1 = {2122, 3333, 33, 366666};
        int lar = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > lar) {
                lar = array1[i];
            }
        }
        System.out.println(lar);
    }
}
