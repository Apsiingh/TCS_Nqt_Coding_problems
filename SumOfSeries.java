public class SumOfSeries {
    public static void main(String[] args) {
        long n=100;
        System.err.println("The sum of series is "+sum(n));
    }

    static long sum(long n){
        return n*(n+1)/2;
    } 
}
