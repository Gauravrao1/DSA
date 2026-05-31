public class Gcd {
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

        public static void main(String[] args) {
                System.out.println(getGcd(18, 12));
        }
}
