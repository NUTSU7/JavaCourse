import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int n=Integer.MAX_VALUE, np=0, nn=0;
        
        Scanner scan = new Scanner(System.in);
        while (n != 0) {
            n = scan.nextInt();
            if (n > 0)
                np++;
            else if (n < 0)
                nn++;
        }
        scan.close();
        System.out.println(np);
        System.out.println(nn);
    }
}
