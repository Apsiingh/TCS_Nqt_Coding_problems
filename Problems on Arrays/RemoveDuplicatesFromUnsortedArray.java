// Example 1:
// Input: arr[]={2,3,1,9,3,1,3,9}
// Output:  {2,3,1,9}

// Explanation: Removed all the duplicate elements

// Example 2:
// Input: arr[]={4,3,9,2,4,1,10,89,34}
// Output: {3,4,9,2,1,10,34,89}
// Explanation: Removed all the duplicate elements

import java.util.*;
public class RemoveDuplicatesFromUnsortedArray {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        //n=is the Size of the Array
        int n=sc.nextInt();

       int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        duplicate(arr, n);

    }

    static void duplicate(int arr[],int n){

        HashMap<Integer,Integer> mp= new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                System.out.println(arr[i]+" ");
                mp.put(arr[i],1);
            }
        }
    
    }
}
