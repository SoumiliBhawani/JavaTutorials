package CopyConstructor;

public class DriveCopyConstructor{

        public static void main(String [] args)
        {
            // SimpleTreeMain(args);
            GradeBookMain();
        }

        public static void SimpleTreeMain(String[] args)
        {
            // Command line arguments passed as input to the driver.
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);

            SimpleTree tree1 = new SimpleTree(10, "Oak");
            SimpleTree tree2 = new SimpleTree(tree1); // Using copy constructor

            tree1.display();
            tree2.display();
        }

        public static void GradeBookMain()
        {
            GradeBook object = new GradeBook(); // Default Constructor

            // Not possible Becoz courseName is private private
            // object.CourseName = "CS101 Introduction to Java Programming";

            // Getting courseName is also not possible because it's private
            // System.out.println("Course Name is: " + object.CourseName);


            // Scenario , when class variable is private , we need public Getters & Setter

            // Setting
            object.setCourseName(null);

            System.out.println("Course Name is: " + object.getCourseName());

            /*
            Declaring instance variables with access modifier private is known as data hiding or
            information hiding. When a program creates (instantiates) an object of class GradeBook,
            variable courseName is encapsulated (hidden) in the object and can be accessed only by
            methods of the object’s class. This prevents courseName from being modified accidentally
            by aclass in another part of the program. In class GradeBook, methods setCourseName and
            getCourseName manipulate the instance variable courseName
             */
        }
}
