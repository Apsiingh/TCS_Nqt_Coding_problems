
// Examples:
// Input: 2 10
// Output: 2 3 5 7 
// Explanation: Prime Numbers b/w 2 and 10 are 2,3,5 and 7.

// Example 2:
// Input: 10 16
// Output: 11 13 
// Explanation: Prime Numbers b/w 10 and 16 are 11 and 13.


public class primeInTheGivenRange {
    public static void main(String[] args) {
        
        int min=2;
        int max=10;

        primeInrange(min, max);
        
    }

    static void  primeInrange(int min,int max){
        for (int i = min; i<= max; i++) {
            if(prime(i)==true){
                System.out.println(i);
            }
        }
        }

        static boolean prime(int n){
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
}
