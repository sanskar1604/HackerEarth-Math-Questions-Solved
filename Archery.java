
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            System.out.println(findgcd(a));
           t--;
       }
    }
    static long findgcd(long a[]){
        long res = a[0];
        long lcm = a[0];
        for(int i = 1; i < a.length; i++){
            res = gcd(lcm, a[i]);
            lcm = (lcm * a[i]) / res;
        }
        return lcm;
    }
    static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);

    }
}
