public class Main {
    public static void main(String[] args) {
        Div7 div7 = new Div7();
        try{
            div7.countDivisibleBy7Numbers(10, 1);
        } catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
