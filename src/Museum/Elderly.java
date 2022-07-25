package Museum;


public class Elderly extends Person {

    private int ElderlyID;
    public boolean Eligible;
    //Eligible for a free ticket

    public Elderly() {
        super(65, "not set");
        ElderlyID = 0;
        Eligible = true;
    }

    public Elderly(int ElderlyID) {
        this();
        this.ElderlyID = ElderlyID;
    }

    //setters

    public void setElderlyID(int ID) {
        ElderlyID = ID;
    }

    public void setEligible(boolean Eligible) {
        this.Eligible = Eligible;
    }

    //getters
    public int getElderlyID() {
        return ElderlyID;
    }

    public boolean isEligible() {
        return Eligible;
    }

    @Override
    public void TicketPricing() {
        System.out.println(super.getName() + " is an elderly so the ticket is free!");
    }

    @Override public String toString(){
        return "Elderly{" + "ElderlyID= " + ElderlyID + ", Eligible for a free ticket= " + Eligible + " " + super.toString();
    }
}
