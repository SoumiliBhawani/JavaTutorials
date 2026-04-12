
public class Hello {

    public static void main(String [] args) {
        // As an entry point it will work

//        // variable of string
//        String s = "Welcome to Java Programming.";
//        // declare another sting and print it in seperate  line;
//        String name= "Soumili";
//
//        System.out.println(s);
//        System.out.println(name);
//
//        // Please combine above string in one variable  and print it in one line
//        String s1= s + name;
//        System.out.println(s1);

        Main(args);
        println("I am in the main");

    }
    public static void println(String message) {
        System.out.println(message);
    }
    public static void println() {
        System.out.println();
    }
    public static void print(String message) {
        System.out.print(message);
    }
    public static void Main(String[] args)
    {
            print("Indra Dev watching Match");
            print("Surya Dev shining bright");
            println();
    }
}