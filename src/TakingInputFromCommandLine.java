import java.util.Scanner;

// Java class library and Java API
// all import statement must be above the class declaration

public class TakingInputFromCommandLine
{
    public static void main(String[] args){

        System.out.println("Enter The Numbers");

        Scanner input  = new Scanner(System.in);


        double a = input.nextDouble();
        double b = input.nextDouble();
        double add= a+b;

        System.out.println(add);

        int c = input.nextInt();
        int d = input.nextInt();
        int subtract = Math.abs(d-c);

        System.out.println(subtract);

        String s = input.next();
        System.out.println(s);


    }

}
