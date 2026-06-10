//find the sum of digit number
public class sumofdigit {
        static int digitsum(int n){
                if (n==10) return 1;
                if (n<10) return n;
                int alldigit =n/10;
                int lastdigit = n%10;
               return digitsum(alldigit)+lastdigit;
        }
        public static void main(String[] args) {
                int n=10;
            System.out.println(digitsum(512));    
        }
}
