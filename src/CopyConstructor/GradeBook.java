package CopyConstructor;

public class GradeBook {
    // Declare a class member as courseName
    private String courseName;



    // Declare a Setter Method for courseName
    public void setCourseName(String name) {
        if (isValidCourseName(name))
        {
            courseName = name;
        } else {
            System.out.println("Invalid course name. Please provide a non-empty name.");
        }
    }

    // Private method to validate course name
    private boolean isValidCourseName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    // Declare a Getter Method for courseName
    public String getCourseName(){
        return courseName;
    }
    // Display the courseName output
    public void display(){
        System.out.println("The courseName is " + courseName);
    }


}
