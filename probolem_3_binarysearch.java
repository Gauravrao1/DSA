//Find the  square root of the given non negative value x .round it off to the nearest floor integer value.
//input:x=4
//output:2
//input:11
//output:3

import java.util.Scanner;

public class probolem_3_binarysearch {
        static int squarefloor(int x){
                return(int) Math.floor(Math.sqrt(x));
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Your num");
                int x =sc.nextInt();
              System.out.println(squarefloor(x));
        }
        
}
