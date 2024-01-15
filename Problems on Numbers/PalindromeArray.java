public class PalindromeArray {
    public class palindromeArray {
        public static void main(String[] args) {
            
          String words[]={ "abc","car","ada","racecar","cool"};
          System.out.println(firstPalindrome(words));
    
        }
    
        public static String firstPalindrome(String[] words) {
            
            for(int i=0;i<words.length;i++){
                if(palindrome(words[i])==true){
                    return words[i];
                }
            }
            return "";
    
      }
    
      public  static boolean palindrome(String str)
       {
          // code here 
          int i=0;
          int j=str.length()-1;
          
          while(i<j){
              if(str.charAt(i)!=str.charAt(j)){
                  return false;
              }
              i++;
              j--;
          }
          return true;
      }
    }
}
