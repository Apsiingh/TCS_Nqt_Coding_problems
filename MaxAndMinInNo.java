
// Example 1:
// Input: N = 2746
// Output: Largest digit: 7
//         Smallest digit: 2
// Explanation: By simply going through the digits of 
// the number, we figure out the largest and smallest 
// digit in the number.

// Example 2:
// Input: N = 23004
// Output: Largest digit : 4
//         Smallest digit : 0
// Explanation: By simply going through the digits of 
// the number, we figure out the largest and smallest 
// digit in the number.

import java.util.*;
public class MaxAndMinInNo {
    public static void main(String[] args) {
        
        int n=2746;

        maxmin(n);

    }

    static void maxmin( int n){
         
        int max=0;
        int min=9;

        while(n!=0){
            
            int last=n%10;

            min=Math.min(min, last);
            max=Math.max(max, last);
            n/=10;
            
        }

        System.out.println(min);
        System.out.println(max);
    }
}
