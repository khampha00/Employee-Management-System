/**
public class StudentResgistry {
    public static void main(String[] args) {
        // Step 1: Create two instances of the Student class
        System.out.println("Creating first student using constructor...");
        Student student1 = new Student("AIU001","Aminu Tukur","year 2","Active");

        System.out.println("\nCreating second student using setters...");
        Student student2 = new Student();
        student2.setId("AIU002");
        student2.setName("Fatima Bello");
        student2.setGrade("year 1");
        student2.setActiveStatus("Inactive");

        // Step 2: Display details of both students
        System.out.println("\nInitial Student Details:"); 
        student1.displayDetails();
        student2.displayDetails();

        // Step 3: Try setting invalid values
        
    }
}
*/

// StudentRegistry class to test the Student class
public class StudentRegistry {
    public static void main(String[] args) {
        // Step 1: Create two Student instances
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Step 2: Set values for first student
        student1.setStudentId("S001");
        student1.setName("John Doe");
        student1.setGrade(85.5);
        student1.setIsActive(true);
        
        // Step 3: Set values for second student
        student2.setStudentId("S002");
        student2.setName("Jane Smith");
        student2.setGrade(92.0);
        student2.setIsActive(true);
        
        // Step 4: Display details of both students
        System.out.println("Displaying information for both students:");
        System.out.println(student1);
        System.out.println(student2);
        
        // Step 5: Compare grades and print who has the higher grade
        Student higherGradeStudent = compareGrades(student1, student2);
        System.out.println("\nComparing grades:");
        System.out.println(higherGradeStudent.getName() + " has the higher grade with " + 
                          higherGradeStudent.getGrade());
        
        // Step 6: Test letter grades
        System.out.println("\nLetter Grades:");
        System.out.println(student1.getName() + "'s letter grade: " + student1.getLetterGrade());
        System.out.println(student2.getName() + "'s letter grade: " + student2.getLetterGrade());
        
        // Step 7: Test passing status
        System.out.println("\nPassing Status:");
        System.out.println(student1.getName() + " is " + 
                          (student1.isPassing() ? "passing" : "not passing"));
        System.out.println(student2.getName() + " is " + 
                          (student2.isPassing() ? "passing" : "not passing"));
        
        // Step 8: Change one student to inactive
        System.out.println("\nChanging " + student1.getName() + "'s status to inactive");
        student1.setIsActive(false);
        System.out.println(student1);
        
        // Extra: Test invalid grade
        System.out.println("\nTesting grade validation:");
        student1.setGrade(105); // Should print error message
    }
    
    // Step 9: Static method to compare grades
    public static Student compareGrades(Student student1, Student student2) {
        if (student1.getGrade() > student2.getGrade()) {
            return student1;
        } else {
            return student2;
        }
    }
}