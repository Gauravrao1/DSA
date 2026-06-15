import java.util.Scanner;

public class countdigit {
static int countdigitnum(int n){
    if(n <= 9)  
        return 1; 

    return 1 + countdigitnum(n / 10);
}
        public static void main(String[] args) {
              Scanner sc =new Scanner(System.in);
              int n = sc.nextInt(); 
           System.out.println(countdigitnum(n));  
        }
}
