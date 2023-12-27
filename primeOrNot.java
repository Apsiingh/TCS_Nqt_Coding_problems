/**
 * primeOrNot
 */


//  Example 1:
// Input: N = 3
// Output: Prime
// Explanation: 3 is a prime number

// Example 2:
// Input: N = 26
// Output: Non-Prime
// Explanation: 26 is not prime

public class primeOrNot {

    public static void main(String[] args) {
        int num=19;
        prime(num);
    }

    static void prime(int n){
        for(int i=2; i*i<=n;i++){
           if(n%i==0){
            System.err.println(n+" the  is not prime number");
           }
        }
        System.err.println(n+" the  is prime number");
    }
}