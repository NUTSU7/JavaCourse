import javax.naming.InvalidNameException;

public class Person {
    String firstName, lastName;
    int age;


    public Person(String firstName, String lastName, int age) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        checkName();
        checkAge();
    }

    private void checkName() throws Exception {
        if (firstName == "" || firstName == null)
            throw new InvalidNameException("firstName null");
        if (lastName == "" || lastName == null) {
            throw new InvalidNameException("LastName null");
        }
    }
    
    private void checkAge() throws Exception {
        if(age<0)
            throw new InvalidAgeException("Varsta prea mica");
        if(age>150)
            throw new InvalidAgeException("Varsta prea mare");
    }

}
