public class sumOfSeries {
        public static void main(String[] args) {
            int n = 5; // Test case

            double sum = 0.0d;

            // Loop from 1 to n
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i; // add reciprocal
            }

            System.out.printf("%nSum: %.4f%n", sum);
        }
    }

