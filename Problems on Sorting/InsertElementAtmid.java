public class InsertElementAtmid {
    public static void main(String[] args) {
        

        int n=8;
        int pos=5;
        int arr[]={10,9,14,8,20,48,16,9,0};
        int value=40;
        System.out.println("Before inserting the value:");
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertatposition(arr,n,value,pos);
    }

    static void insertatposition(int []arr,int n,int val,int pos){

        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            if(i<pos){
               temp[i]=arr[i];
            }else if(i==pos){
                temp[i]=val;
            }else{
                 temp[i]=arr[i-1];
            }
        }
        System.out.println("After Inserting at the Value At given pos: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}

//Akhand Pratap Singh