import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 5, 6, 1, 2, 7, 8, 12, 99 };
        int[][] arr2 = new int[][] { { 1, 2, 3 }, { 6, 2, 6 }, { 9, 10, 13 } };
        int[] sum =new int[] {0, 0};
        int[] np = new int[] {0, 0};
        int[] nimp= new int[] {0, 0};
        
        for (int i = 0; i < arr1.length; i++) {
            sum[0] += arr1[i];
            if (arr1[i] % 2 == 0)
                np[0]++;
            else
                nimp[0]++;
        }
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum[1] += arr2[i][j];
                if (arr2[i][j] % 2 == 0)
                    np[1]++;
                else
                    nimp[1]++;
            }
        }

        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(np));
        System.out.println(Arrays.toString(nimp));

    }
}
