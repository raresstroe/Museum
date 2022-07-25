package Museum;


public class Student extends Person{

    private int StudentID;
    public boolean Eligible;
    //Eligible for a free ticket

    public Student(){
        super(18, "not set");
        StudentID = 0;
        Eligible = true;
    }

    public Student(int StudentID){
        this();
        this.StudentID = StudentID;
    }

    public void setStudentID(int ID){
        StudentID = ID;
    }

    public void setEligible(boolean Eligible){
        this.Eligible = Eligible;
    }

    public int getStudentID(){
        return StudentID;
    }

    public boolean isEligible(){
        return Eligible;
    }

    @Override public void TicketPricing(){
        System.out.println(super.getName() + " is a student so the ticket is free!");
    }

    @Override public String toString(){
        return "Student{" + "StudentID= " + StudentID + ", Eligible for a free ticket= " + Eligible + ", "+ super.toString();
    }

}
