public class Faculty {
    //Data Fields
    private int employeeID;
    private String name;
    private String department;

    //Constructor
    public Faculty(int employeeID, String name, String department){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
    }

    //Getters
    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    //Setters
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //Methods
    @Override
    public String toString(){
        return "ID: " + getEmployeeID() + " | Name: " + getName() + " | Department: " + getDepartment();
    }
}
