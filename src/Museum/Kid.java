package Museum;

public class Kid {
    public boolean hasParent;
    private String name;
    private int Age;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Kid(String name) {
        this.name = name;
    }

    public void hasParent() {
        if (hasParent) {
            System.out.println("The kid has a parent so he can visit!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'" + name + '\'';

    }

    public void TicketPricing() {
        if(hasParent == false)
        System.out.println(name + " has a free museum ticket, but needs a parent...");
        else
            System.out.println(name + " can enter the museum for free!");
    }
}
