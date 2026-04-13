import java.util.Scanner;
public class CalculatorApp {
    public double add(double a, double b){
        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double divide(double a , double b){
        return a/b;
    }
    public double multiply(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculatorApp cal = new CalculatorApp();
        System.out.println("Enter the numbers");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Enter operations(add,subtract,multiply,divide):");
        String operations = input.next();
        double result = 0;
        if (operations.equals("add")) {
            result = cal.add(a, b);
        } else if (operations.equals("subtract")) {
            result = cal.subtract(a, b);
        } else if (operations.equals("divide")) {
            result = cal.divide(a, b);
        } else if (operations.equals("multiply")) {
            result = cal.multiply(a, b);
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("Result:" + result);
    }
}





