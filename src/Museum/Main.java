package Museum;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Kid kid = new Kid("Andrei");
        Person p = new Person();
        System.out.println(p);
        p.getKid();
        p.setKid(kid);
        p.setName("Alex");
        p.setDateOfBirth(LocalDate.of(2000, 9, 15));
        p.setAge(p.getAge());
        System.out.println(p);
        p.TicketPricing();

        Person p2 = new Person();
        Kid kid4 = new Kid("Octavian");
        p2.setName("Iulian");
        p2.setKid(kid4);
        p2.setDateOfBirth(LocalDate.of(1985, 01, 07));
        p2.setAge(p2.getAge());
        System.out.println(p2);
        System.out.println(p2);
        p2.TicketPricing();


// Testez daca merge hasParent din ticket pricing
        Kid kid3 = new Kid("Maricel");
        kid3.setAge(9);
        kid3.TicketPricing();
        kid3.hasParent = true;
        kid3.TicketPricing();

//Inainte de modificari
        Person student = new Student(23141256);
        System.out.println(student);
//Dupa Modificari
        student.Eligible = true;
        student.setName("Marian");
        student.setDateOfBirth(LocalDate.of(1999, 3, 3));
        student.setAge(student.getAge());
        System.out.println(student);
        student.TicketPricing();

//Inainte de modificari
        Kid kid2 = new Kid("Marian");
        Person elderly = new Elderly(1235123);
        System.out.println(elderly);
//Dupa modificari
        elderly.getKid().getName();
        elderly.setKid(kid2);
        elderly.setName("Marcel");
        elderly.setDateOfBirth(LocalDate.of(1957, 5, 1));
        elderly.setAge(elderly.getAge());
        elderly.Eligible = true;
        System.out.println(elderly);
        elderly.TicketPricing();
    }
}
