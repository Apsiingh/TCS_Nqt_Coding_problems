public class InsertElementAtFrist {
    
    public static void main(String[] args) {
        int n=8;
        int arr[]={10,9,14,8,20,48,16,9,0};
        int val=50;

        System.out.println("Before Inserting the value:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        insertelementfrist(arr,n,val);
        System.out.println("After Inserting the Value:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

     static void insertelementfrist(int []arr,int n,int val){
             
     for(int i=n-1;i>=0;i--){
        arr[i+1]=arr[i];
     }
     arr[0]=val;

    }
}


// Akhand Pratap Singh