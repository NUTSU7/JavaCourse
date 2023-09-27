import automobil.Automobil;
import person.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");

        Person Liviu = new Person();

        System.out.println(Liviu.getAge());

        Automobil bmw = new Automobil();

        bmw.setData(2006, "BMW", "seria 3");

        System.out.println(bmw.getAnProd());
        System.out.println(bmw.getModel());
        System.out.println(bmw.getSeria());
    }
}