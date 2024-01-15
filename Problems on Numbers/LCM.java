// Example 1:
// Input: num1 = 4,num2 = 8
// Output: 8


// Example 2:
// Input: num1 = 3,num2 = 6
// Output: 6


public class LCM {
    public static void main(String[] args) {
        int n1=4;
        int n2=8;
        
        int resgcd=gcd(n1, n2);
        System.err.println("GCD OF N1 AND N2 "+resgcd);
        int reslcm=lcm(n1, n2);
        System.err.println("LCM OF N1 AND N2 "+reslcm);
    }

    static int gcd(int a,int b){
       

        while(a!=b){
            if (a>b) {
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }

    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
