import java.util.Arrays;
import java.util.Scanner;

// The largest element in the Array

// Example 1:
// Input: arr[] = {2,5,1,3,0};
// Output: 5
// Explanation: 5 is the largest element in the array. 

// Example2: 
// Input: arr[] = {8,10,5,7,9};
// Output: 10
// Explanation: 10 is the largest element in the array.

public class LargestNumber {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        // n is the Size of the Array
        int n=sc.nextInt();
        int Arr[]=new int[n];

        for(int i=0;i<n;i++){
            Arr[i]=sc.nextInt();
        }

        Arrays.sort(Arr);
        int small=0;
        small=Arr[n-1];
        System.out.println(small+" is the Largest element in tha Array");
    }
}

//By -- Akhand Pratap Singh..

