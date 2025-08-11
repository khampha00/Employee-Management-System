/** 
public class Student implements Cloneable {
    private String id;
    private String name;
    private String grade;
    private String activestatus;

    public Student() {
        this.id = "Unknown";
        this.name = "Unknown";
        this.grade = "Not Assigned";
        this.activestatus = "Inactive";
    }

    public Student(String id, String name, String grade, String active_status) {
        setId(id);
        setName(name);
        setGrade(grade);
        setActiveStatus(activestatus);
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getGrade() {
        return this.grade;
    }

    public String getActiveStatus() {
        return this.activestatus;
    }


    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            System.out.println("Error: ID cannot be null or empty. Setting to 'Unknown'");
            this.id = "Unknown";
        }
    }


    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Name cannot be null or empty. Setting to 'Unknown'");
            this.name = "Unknown";
        }
    }

    public void setGrade(String grade) {
        if (grade != null && !grade.trim().isEmpty()) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade cannot be null or empty. Setting to 'Not Assigned'");
            this.grade = "Not Assigned";
        }
    }

    public void setActiveStatus(String active_status) {
        if (active_status != null && !active_status.trim().isEmpty()) {
            this.activestatus = active_status;
        } else {
            System.out.println("Error: Active status cannot be null or empty. Setting to 'Inactive'");
            this.activestatus = "Inactive";
        }
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);
        System.out.println("Active Status: " + this.activestatus);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

*/

// Student class to store and manage student information
public class Student {
    // Step 1: Private variables for student data
    private String studentId;
    private String name;
    private double grade;
    private boolean isActive;
    
    // Step 2: Getter methods to access private variables
    public String getStudentId() {
        return this.studentId;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getGrade() {
        return this.grade;
    }
    
    public boolean getIsActive() {
        return this.isActive;
    }
    
    // Step 3: Setter methods with simple validation
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setGrade(double grade) {
        // Validate grade is between 0 and 100
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100");
        }
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    // Step 4: Method to stringify student details
    public String displayStudentDetails() {
        return "ID: " + this.studentId +
                "\nName: " + this.name + 
                " Grade: " + this.grade +
                "\nStatus: " + (this.isActive ? "Active" : "Inactive");
    }
    
    // Step 5: Method to calculate letter grade
    public String getLetterGrade() {
        if (this.grade >= 90) {
            return "A";
        } else if (this.grade >= 80) {
            return "B";
        } else if (this.grade >= 70) {
            return "C";
        } else if (this.grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Step 6: Method to check if student is passing
    public boolean isPassing() {
        return this.grade >= 60;
    }
}