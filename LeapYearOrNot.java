// Example 1:
// Input: 1996
// Output: Yes
// Explanation: Since 1996 is a leap year answer is “Yes”.

// Example 2:
// Input: 2000
// Output: Yes

// Explanation: Since 2000 is a leap year answer is “Yes”.



public class LeapYearOrNot {
    public static void main(String[] args) {
        
        int year=1994;

        if(leapYear(year)==true){
            System.out.println("This is the Leap Year");
        }else{
            System.out.println("This is not a Leap Year");
        }

    }

    static boolean leapYear(int year){

        if((year%4==0)||(year%100==0)||(year%400==0)){
            return true;
        }
        return false;

    }
}
