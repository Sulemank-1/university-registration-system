public class Student {
    //Data Fields
    private int studentID;
    private String name;
    private double gpa;

    //Constructor
    public Student(int studentID, String name, double gpa){
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    //Getters
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    //Setters
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //Methods
    @Override
    public String toString(){
        return "ID: " + getStudentID() + " | Name: " + getName() + " | GPA: " + getGpa();
    }
}
