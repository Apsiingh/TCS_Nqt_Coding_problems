import java.util.*;


//  Find the smallest element in an array

//  Example 1:
//  Input: arr[] = {2,5,1,3,0};
//  Output: 0
//  Explanation: 0 is the smallest element in the array. 
 
//  Example2: 
//  Input: arr[] = {8,10,5,7,9};
//  Output: 5
//  Explanation: 5 is the smallest element in the array



public class SmalletElement {

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
        small=Arr[0];
        System.out.println(small+" is the smallest element in tha Arrays");
    }
}

//By -- Akhand Pratap Singh..