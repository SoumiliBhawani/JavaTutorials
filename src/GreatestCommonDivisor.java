public class GreatestCommonDivisor {

        public static void main(String[] args) {
            int a = 48;
            int b = 18; // Test case 1

            while(a!=b)
            {
                if(a>b)
                    a=a-b;
                if(b>a)
                    b=b-a;

            }
            System.out.println("GCD: "+a);
        }
    }

