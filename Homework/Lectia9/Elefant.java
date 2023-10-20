public class Elefant extends Erbivor implements Animal{
    int age;
    String desc, name;

    public Elefant() {
        
    }

    public Elefant(int age, String desc, String name) {
        this.age = age;
        this.desc = desc;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void manancaFructe() {
        System.out.println("da");
    }
}
