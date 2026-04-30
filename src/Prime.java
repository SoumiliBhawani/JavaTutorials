public class Prime {
    public static void main(String[] args) {
        int number = 17; // Test case 1

        // Check if number is prime
        // Print: Is prime: <true/false>
        boolean isPrime = true;
        if(number <= 1) {
            isPrime = false;
        }
        else {
            for(int i = 2; i <= (number/2); i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break; // Exit loop when divisor is found
                }
            }
        }
        System.out.println("Is prime: " + isPrime);
    }
}

