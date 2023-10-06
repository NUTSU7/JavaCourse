public class ex2 {

    public static void main(String[] args) {
        int c=0;
        for (int i = 100; i <= 1000; i+=5) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
                c++;
            }
            if (c % 10 == 0 && c!=0) {
                System.out.println();
                c = 0;
            } 
        }
    }
}
