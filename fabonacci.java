import java.util.Scanner;

public class fabonacci { 
        static int fabonaccinum(int n){  
                if(n ==0||n==1) return n;
                return fabonaccinum(n-1)+fabonaccinum(n-2);
        }
        public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                int n = sc.nextInt();
            System.out.println(fabonaccinum(n));
        } 
}
