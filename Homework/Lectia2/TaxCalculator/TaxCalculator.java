public class TaxCalculator {
    public static void main(String[] args) {
        Variables vars = new Variables();
        vars.price = 200;
        vars.quantity = 2;
        vars.tax = 50.75;

        System.out.println(vars.getMessage());

        vars.total = vars.price * vars.quantity * vars.tax;

        System.out.println("Total cost with tax is: " + vars.total);
    }
}
