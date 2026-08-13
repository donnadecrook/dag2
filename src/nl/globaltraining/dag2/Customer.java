package nl.globaltraining.dag2;

public class Customer {
    private String name;
    private int age;
    private String email;
    boolean student;

    public Customer(String name, int age, String email, boolean student) {
         setName(name);
         setAge(age);
         this.email = email;
         this.student = student;
    }
    public String getName() {
        return name;
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
    public int getAge() {
        return age;
    }
    public boolean isStudent() {
        return student;
    }
    public void setStudent(boolean student) {
        this.student = student;
    }
    public String toString() {
        return name + ", " + age + " jaar, " + email + " ";
    }
}
