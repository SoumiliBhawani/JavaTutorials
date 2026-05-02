public class numberPattern {
        public static void main(String[] args) {
            int n = 4; // Test case 1
            // number of rows
            for(int i=1;i<=n;i++){
                // inner loop prints numbers from 1 to i
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            // Print pattern:
            // 1
            // 12
            // 123
            // 1234
        }
    }

