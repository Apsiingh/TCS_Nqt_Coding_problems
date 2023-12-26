public class palindromeNoInArange {
    public static void main(String[] args) {
        
        int min=10;
        int max=50;
        
        for(int i=min;i<=max;i++){
            if(palindrome(i)==true)
                System.out.println(i);
        }
    }

        static boolean palindrome(int n){
            int temp=n;
        int rev=0;
        while(temp!=0){
          rev=rev*10+temp%10;
          temp/=10;
        }
        if (n==rev)
        return true;
       return false; 
    }
}
