public class LCM {
        public static void main(String[] args) {
            int a = 12;
            int b = 18;
            int temp1=a;
            int temp2=b; // Test case 1
            while(a!=b)
            {
                if(a>b)
                    a=a-b;
                if(b>a)
                    b=b-a;

            }
            int gcd=a;
            int res=(temp1*temp2)/gcd;
            System.out.println("LCM: "+res);
            // Find LCM (hint: LCM = a*b / GCD)
            // Print: LCM: <result>
        }
    }

