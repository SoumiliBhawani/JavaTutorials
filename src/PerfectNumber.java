public class PerfectNumber {

        public static void main(String[] args) {
            int number = 28;
            int sum=0;
            boolean isPerfect=true;
            // Test case 1
            for(int i=1;i<number;i++){
                if(number%i==0)
                    sum=sum+i;
            }
            if(sum==number)
                System.out.println("Is perfect: "+isPerfect);
            // Check if perfect: 28 = 1+2+4+7+14
            // Print: Is perfect: <true/false>
        }
    }

