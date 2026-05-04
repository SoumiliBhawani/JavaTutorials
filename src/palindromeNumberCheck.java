public class palindromeNumberCheck {
        public static void main(String[] args) {
            int number = 12321; // Test case 1
            int rev=0;
            // Check if number is a palindrome
            // Print: Is palindrome: <true/false>
            boolean isPalindrome=true;
            for(int temp=number;temp>0;temp=temp/10){
                int remainder=temp%10;
                rev=rev*10+remainder;
            }
            if(number==rev)
                isPalindrome=true;
            else
                isPalindrome=false;
            System.out.println("Is palindrome: " + isPalindrome);
        }
    }

