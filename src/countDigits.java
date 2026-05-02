public class countDigits {

        public static void main(String[] args) {
            int number = 12345; // Test case 1
            int count=0;
            for(int temp=number;temp>0;temp=temp/10){
                int lastDigit=temp%10;
                count++;
            }
            System.out.println("Digit count: "+count);
            // Write code to count digits
            // Should work for ANY positive number
            // Print: Digit count: <result>
        }
    }

