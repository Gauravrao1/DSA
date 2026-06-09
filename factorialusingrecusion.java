
import java.util.*;
public class factorialusingrecusion {
      

        static int factorial(int n){
                if ( n==0) return 1;
              
            int smallAns =factorial(n-1);
            int ans =n*smallAns;
            return ans;
        }
        public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                int n = sc.nextInt();
              System.out.println(factorial(n));      

         }
}

