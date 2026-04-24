import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the numbers");
        double a = input.nextDouble();
        double b = input.nextDouble();


        CalculatorApp cal = new CalculatorApp(a,b);
        CalculatorApp cal1 = new CalculatorApp();


        System.out.println("Enter operations(add,subtract,multiply,divide):");
        String operations = input.next();
        double result = 0;
        if (operations.equals("add")) {
            result = cal.add();
        } else if (operations.equals("subtract")) {
            result = cal.subtract();
        } else if (operations.equals("divide")) {
            result = cal.divide();
        } else if (operations.equals("multiply")) {
            result = cal.multiply();
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("Result:" + result);
    }
}
