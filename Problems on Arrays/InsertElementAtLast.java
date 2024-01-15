public class InsertElementAtLast {
    
        public static void main(String[] args) {
            int n=8;
            int arr[]={10,9,14,8,20,48,16,9,0};
            int val=50;
    
            System.out.println("Before Inserting the value:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
    
            System.out.println();
    
            insertelementlast(arr,n,val);
            System.out.println("After Inserting the Value:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
    
        }
    
         static void insertelementlast(int []arr,int n,int val){
                 
         arr[n-1]=val;
    
        }
    }
    
    
    // Akhand Pratap Singh

