import java.util.ArrayList;

public class Course {
    //Data Fields
    private String courseCode;
    private String title;
    private Faculty instructor;
    private ArrayList<Student> enrolledStudents;
    private final int MAX_SEATS = 3;

    //Constructor
    public Course(String courseCode, String title, Faculty instructor){
        this.courseCode = courseCode;
        this.title = title;
        this.instructor = instructor;
        enrolledStudents = new ArrayList<>();
    }

    //Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    //Setters
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }

    //Methods
    public boolean registerStudent(Student s){
        if (enrolledStudents.size() >= MAX_SEATS){
            System.out.println("Course seats full");
            return false;
        }
        for (Student student: enrolledStudents)
            if (student.getStudentID() == s.getStudentID()){
                System.out.println("Student ID already present");
                return false;
            }
        enrolledStudents.add(s);
        return true;
    }

    public boolean dropStudent(int studentID){
        for (Student student: enrolledStudents)
            if (student.getStudentID() == studentID) {
                enrolledStudents.remove(student);
                return true;
            }
        System.out.println("Student ID not found");
        return false;
    }





}
