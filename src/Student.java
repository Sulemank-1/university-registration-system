public class Student extends Person{
    //Data Fields
    private double gpa;

    //Constructor
    public Student(int studentID, String name, double gpa){
        super(studentID, name);
        this.gpa = gpa;
    }

    //Getters
    public double getGpa() {
        return gpa;
    }

    //Setters
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //Methods
    @Override
    public String toString(){
        return "ID: " + getId() + " | Name: " + getName() + " | GPA: " + getGpa();
    }

    @Override
    public String getRole(){
        return "Student";
    }
}
