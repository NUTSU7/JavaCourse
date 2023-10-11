public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("lenovo", "laptop", -2, 10.0);
        System.out.println(invoice.getQuant());
        System.out.println(invoice.getAmount());
    }
}
