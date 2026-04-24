package CopyConstructor;

public class DriveCopyConstructor{

        public static void main(String [] args)
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
}
