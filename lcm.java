public class lcm {
        
        static int getGcd(int a, int b){
                //gcd(a,b)=gcd(b,a%b)
                while (b!=0) {
                        int temp =b;
                        b = a%b;
                        a =temp;
                        }
                int ans =a;
                return ans;
        }
        static int lcm(int a,int b){
                int gcd =getGcd(a, b);
                int prod =a*b;
                int lcm =prod/gcd;
                return lcm;
        }

        public static void main(String[] args) {
                System.out.println(lcm(10, 20));
        }
}
