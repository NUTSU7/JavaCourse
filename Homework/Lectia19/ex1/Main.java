public class Main {
    public static void main(String[] args) {
        try{
            Person p1 = new Person(null, null, 15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
