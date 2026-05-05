public class ArmstrongNumber {

        public static void main(String[] args) {
            int number = 153;
            boolean isArmstrong=true;
            int sum=0;// Test case 1
            for(int temp=number;temp>0;temp=temp/10){
                int lastDigit=temp%10;
                sum=sum+(lastDigit^3);
            }
            if(sum==number)
                System.out.println("Is Armstrong: "+isArmstrong);
            else
                System.out.println("Is Armstrong: "+isArmstrong);
            // Check if Armstrong: 153 = 1^3 + 5^3 + 3^3
            // Print: Is Armstrong: <true/false>
        }
    }

