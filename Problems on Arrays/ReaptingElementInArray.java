/**
 * ReaptingElementInArray
 */


//  Example 1:
// Input: 
// Arr[] = [1,1,2,3,4,4,5,2]
// Output:
//  1,2,4
// Explanation:
//  1,2 and 4 are the elements which are occurring more than once.

// Example 2:
// Input:
//  Arr[] = [1,1,0]
// Output:
//  1
// Explanation:
//  Only 1 is occurring more than once in the given array.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReaptingElementInArray {

    public static void main(String[] args) {
        
        int[] arr = {1,1,2,3,4,4,5,2,2,2};
		findRepeatingElements(arr);

    }

    static void findRepeatingElements(int []arr)
    {
        HashMap<Integer,Integer> count= new HashMap<>();

        for(int i:arr){
            if (count.get(i)==null) {
                count.put(i,1);
            }else{
                count.put(i, count.get(i)+1);
            }
        }
         
        System.out.print("The repeating elements are: ");
        
        for(Map.Entry<Integer,Integer> entry: count.entrySet()) {
	        if(entry.getValue()>1)
	            System.out.print(entry.getKey()+" ");
	    }
        
        }
    }
        
    