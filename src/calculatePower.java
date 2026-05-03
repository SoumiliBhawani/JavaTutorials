public class calculatePower {
        public static void main(String[] args) {
            int base = 3;
            int exponent = 4; // Test case 1

            // Calculate base^exponent using a loop (no Math.pow)

            // Print: Result: <result>
            int result = 1;

            // Loop to multiply base exponent times
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
            }
            System.out.println("Result: "+result);
        }
    }
