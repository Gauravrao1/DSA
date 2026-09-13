// Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1 - 2 + 3 - 4 + 5 = 3 as your answer.
// Constraints: 0 <= n <=le6
// Input: n = 10
// Output 1: -5
// Input2: n = 5
// Output2: 3
public class findalternativesum {
        static int printsumalternativesum(int n){
                if(n==1) return n;
                if(n%2==0) {
                        return printsumalternativesum(n-1)-n;
                }
                return printsumalternativesum(n-1)+n;
        }
        public static void main(String[] args) {
                int n = 3;
                System.out.println(printsumalternativesum(n));
        }
}
