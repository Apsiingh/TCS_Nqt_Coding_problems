import java.util.Scanner;
import java.util.*;

// Example 1:
// Input: [1,2,4,7,7,5]
// Output: Second Smallest : 2
// 	Second Largest : 5
// Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

// Example 2:
// Input: [1]
// Output: Second Smallest : -1
// 	Second Largest : -1
// Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.

public class Print2Largest {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);

    // n is the size of the Array

     int n=sc.nextInt();

     int arr[]= new int[n];

     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }

     Arrays.sort(arr);
      int max=arr[n-1];
     for(int i=n-2;i>=0;i--){
         if(arr[i]!=max){
            System.out.println(arr[i]+" is the Second Largest Number");
            break;
         }else{
            continue;
         }
     }
}
}

//By --Akhand Pratap Singh