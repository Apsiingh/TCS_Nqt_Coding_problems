// Example 1:
// Input: N = 1011
// Output: 11
// Explanation: 1011 when converted to decimal number is “11”.

// Example 2:
// Input: 100
// Output: 4
// Explanation: 100 when converted to decimal number is “4”.


public class BinaryToDecimal {
    public static void main(String[] args) {
      String  s="1011";
      int ans=binaryToDecial(s);
      System.err.println(ans);
    }
    
    public static int binaryToDecial(String s){
        
        int n = s.length();
        int base = 1;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
          if (s.charAt(i) == '1') {
            ans += base;
          }
          base *= 2;
        }
         return ans;
    }
}
