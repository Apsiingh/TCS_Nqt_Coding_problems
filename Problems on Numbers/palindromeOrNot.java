// Example 1:
// Input: N = 123
// Output: Not Palindrome Number
// Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.

// Example 2:
// Input: N =  121 
// Output: Palindrome Number
// Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.

public class palindromeOrNot {
    public static void main(String[] args) {
        
        int n=121;

        if(palindrome(n)==true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
    static boolean palindrome(int n){
            
        int temp=n;
        int rev=0;
        while(temp!=0){
          rev=rev*10+temp%10;
          temp/=10;
        }
        if (n==rev)
        return true;
       return false; 
    }
}
