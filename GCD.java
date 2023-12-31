// Example 1:
// Input: num1 = 4, num2 = 8
// Output: 4
// Explanation: Since 4 is the greatest number which divides both num1 and num2.

// Example 2:
// Input: num1 = 3, num2 = 6
// Output: 3
// Explanation: Since 3 is the greatest number which divides both num1 and num2.



//              EUCLIDING ALGO


public class GCD {
    public static void main(String[] args) {
        
      int n1=4;
      int n2=8;
       
      int res=gcd(n1, n2);
      System.err.println(res);
      
    }
    static int gcd(int a,int b){
        while (a!=b) {
            if (a>b) {
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    
}
// By -- Akhand Pratap Singh
