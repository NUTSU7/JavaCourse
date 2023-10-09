import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 5, 6, 1, 2, 7, 8, 12, 99 };
        int[] arr2 = new int[]{};

        arr2 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr2));
    }
}
