
// Example 1:
// Input:153 
// Output: Yes, it is an Armstrong Number
// Explanation: 1^3 + 5^3 + 3^3 = 153

// Input:170 
// Output: No, it is not an Armstrong Number
// Explanation: 1^3 + 7^3 + 0^3 != 170



public class ArmstrongAreNot {
    public static void main(String[] args) {
        int n=153;
         if (armstrong(n)) {
            System.out.println("Yes, it is an Armstrong Number\n");
        }
        else
        {
            System.out.println("No, it is not an Armstrong Number\n");
        }
            
    }

    static boolean armstrong(int n){
       
        int temp=n;
        int sum=0;
        while (temp>0) {
            int last=temp%10;
            sum=sum+(last*last*last);
            temp/=10;
        }
         if (sum==n) {
            return true;
         } else {
            return false;
         }
    }
}
