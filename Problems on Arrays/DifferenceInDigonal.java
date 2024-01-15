/**
 * DifferenceInDigonal
 */

//  N=3
// Grid=[[1,2,3],[4,5,6],[7,8,9]]
// Output: 
// 0
// Explanation:
// Sum of primary diagonal = 1+5+9 = 15.
// Sum of secondary diagonal = 3+5+7 = 15.
// Difference = |15 - 15| = 0.


public class DifferenceInDigonal {

    public static void main(String[] args) {
        

        int [][]grid={{1,2,3},{4,5,6},{7,8,9}};
        int gridLength=3;
        
        int res=diffDigonal(grid,gridLength);
        System.out.println(res);
    }

    public static int diffDigonal(int [][]a ,int n){
       
      int sum1=0;
      int sum2=0;

      for(int i=0;i<n;i++){
        sum1+=a[i][i];
        sum2+=a[i][n-i-1];
      }

      int res=Math.abs(sum1-sum2);
      return res;

    } 
}