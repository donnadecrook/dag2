package nl.globaltraining.dag2;

public class Customer {
    private String name;
    private int age;
    private String email;

    public Customer(String name, int age, String email) {
         setName(name);
         setAge(age);
         this.email =  email;
    }
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Ongeldige naam");
            return;
        }
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("Ongeldige leeftijd");
            return;
        }
            this.age = age;
    }
    public String toString() {
        return name + ", " + age + " jaar, " + email + " ";
    }
}
