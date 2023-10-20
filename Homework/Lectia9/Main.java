public class Main {
    public static void main(String[] args) {
        Animal elefant = new Elefant(10, "Bun", "Nu are");
        System.out.println(elefant.getAge());
        System.out.println(elefant.getDesc());
        System.out.println(elefant.getName());
        System.out.println(Animal.getType());
        Elefant erbivor = new Elefant(11, "Rau", "nush");
        System.out.println(erbivor.getAge());
        System.out.println(erbivor.getDesc());
        System.out.println(erbivor.getName());
        erbivor.ceMananca();

    }
}
