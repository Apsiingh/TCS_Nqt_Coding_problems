import java.util.Scanner;

// Example 1:
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

// Example 2:
// Input: N=6 arr[] = {10,20,30,40}
// Output: {40,30,20,10}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.


public class ArrayReverse {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // where is the Size of the Array...
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int start=0;
    int end=n-1;
     while(start<end){
        
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
     }
     
     for(int i=0;i<n;i++){
        System.err.println(arr[i]);
     }

   }
}
