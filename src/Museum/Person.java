package Museum;
import java.time.LocalDate;


public class Person {

    private int age;
    private String name;
    private LocalDate dateOfBirth;
    boolean hasParent;
    boolean Eligible;

    private Kid kid = new Kid("has no kid");

    public Person() {
        super();
        kid = new Kid("Default name");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(Kid kid) {
        this.kid = kid;
    }

    public int getAge() {
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kid getKid() {
        return kid;
    }

    public void setKid(Kid kid) {
        this.kid = kid;
    }

    public void TicketPricing() {
        if (age <= 10) {
            System.out.println(name + " has a free museum ticket, but needs a parent...");
        }
        else if (age <= 10 && hasParent == true) {
            System.out.println(name = " can enter the museum for free!");

        }
            else{
            System.out.println(name + " cant get a free ticket... The price of the ticket is 5$.");
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return dateOfBirth.equals(person.dateOfBirth) && name.equals(person.name);
    }

    @Override
    public String toString() {
        return "Person{" + "age= " + age + ", dateOfBirth= " + dateOfBirth + ", name='" + name + "\'" + ", Eligible for a free ticket= " + Eligible + ", " +
                (kid != null ? "Kids name= " + kid + "}" : "}");
    }


}


