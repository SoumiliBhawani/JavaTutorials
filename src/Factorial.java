public class Factorial {
        public static void main(String[] args) {
            int n = 5; // Test case 1
            int fact=1;
            // Calculate n! = n * (n-1) * ... * 1
            // Print: Factorial: <result>
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }

            System.out.println("Factorial: "+ fact);
        }
    }


