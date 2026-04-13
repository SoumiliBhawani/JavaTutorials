import java.util.Scanner;
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.println("Enter the numbers");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Enter operations(+,-,/,*):");
        char operations = input.next().charAt(0);
        double result=0;
        switch (operations) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.println("The final result:");
        System.out.println(a + " " + operations + " " + b + " = " + result);
    }
}


