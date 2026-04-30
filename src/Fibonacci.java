public class Fibonacci {

        public static void main(String[] args) {
            int n = 10; // Test case 1

            // Calculate nth Fibonacci number (0-indexed)
            // Print: Fibonacci: <result>
            int a=0, b=1, c=0;
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println("Fibonacci:"+" "+c);
        }
    }

