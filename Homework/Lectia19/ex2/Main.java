public class Main {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        try{
            num.divideBy(0);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
