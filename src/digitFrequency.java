public class digitFrequency {

        public static void main(String[] args) {
            int number = 122333;
            int digit = 3; // Test case 1

            // Count occurrences of digit in number
            int count=0;
            for(int temp=number;temp>0;temp=temp/10){
                int remainder=temp%10;
                if(remainder==digit){
                    count++;
                }
            }
            // Print: Count: <result>
            System.out.println("Count:"+" "+ count);
        }
    }
