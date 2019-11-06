package day1106;

public class text04 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];

        }
        System.out.println(sum);
    }
}
