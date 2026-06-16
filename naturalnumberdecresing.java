import java.util.Scanner;

public class naturalnumberdecresing {
        static void printdecrsingnatural(int n){
                if ( n==1) {
                   System.out.println(1);
                    return;    
                } 
                System.out.println(n);
           printdecrsingnatural(n-1);    
        }
        public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                int n = sc.nextInt();
                printdecrsingnatural(n);
        }
}
