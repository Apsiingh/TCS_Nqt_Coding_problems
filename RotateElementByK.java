
// Example 1:
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
// Explanation: Rotate the array to right by 2 elements.

// Example 2:
// Input: N = 7, array[] = {1,2,3,4,5,6,7} K=3
// Output: {4,5,6,7,1,2,3}
// Explanation: Rotate the array to right by 3 elements.

import java.util.*;
public class RotateElementByK {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();

        // size of the Array
        int n=sc.nextInt();


       int arr[]=new int[n];
       for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
       }
       RotateElementByK ob=new RotateElementByK();  
        ob.rotateArr(arr, k, n);

        for(int i=0;i<n;i++){
            System.err.println(arr[i]);
        }

    }

    static void rotateArr(int arr[], int d, int n)
    {
          revarr(arr,0,(d%n)-1);
          revarr(arr,(d%n),n-1);
          revarr(arr,0,n-1);
    }
    
    static void revarr(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}

//BY -- AKHAND PRATAP SINGH
