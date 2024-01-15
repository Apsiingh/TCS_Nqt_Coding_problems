
// Example 1:
// Input: N = 6, array[] = {13,46,24,52,20,9}
// Output: 9,13,20,24,46,52
// Explanation: After sorting we get 9,13,20,24,46,52


// Input: N = 5, array[] = {5,4,3,2,1}
// Output: 1,2,3,4,5
// Explanation: After sorting we get 1,2,3,4,5

public class BubbleSort {
    public static void main(String[] args) {
                
       int array[] = {13,46,24,52,20,9};
       bubblesort(array);

    }

    static void bubblesort(int arr[]){
        int n=arr.length;
        boolean swap=false;
        for(int i=0;i<n-1;i++){
             for(int j=0;j<n-i-1;j++){
        //change the sign '>' to get the reverse array
                 if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap =true;
                 }
                 }
                 if(swap==false){
                    break;
             }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

