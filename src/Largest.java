import java.util.Scanner;
public class Largest {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1, num2,num3;
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        int largest;
        if(num1>=num2 && num1>=num3){
            largest= num1;
        }
        else if(num2>=num1 && num2>=num3){
            largest= num2;
        }
        else{
            largest= num3;
        }
        System.out.println("Largest number :" +largest);
    }
}
