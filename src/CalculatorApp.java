import java.util.Scanner;
public class CalculatorApp {

    private double operand1;
    private double operand2;


    public CalculatorApp()
    {
        System.out.println("I am providing a default contructor");
    }

    // Parameterized Construction , No return type is needed.

    public CalculatorApp(double a, double b)
    {
        operand1 = a;
        operand2 = b;
    }

    public double add()
    {
        return operand1+operand2;
    }  // class methods

    public double subtract(){
        return operand1 - operand2;
    }
    public double divide(){
        return operand1/operand2;
    }
    public double multiply(){
        return operand1*operand2;
    }

}





