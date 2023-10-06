public class ex3 {
    public static void main(String[] args) {
        float sum = 0;
        for (int i = 3; i < 100; i += 2) {
            double temp = i;
            sum +=(temp - 2) / temp;
        }
        System.out.println(sum);
    }
}
