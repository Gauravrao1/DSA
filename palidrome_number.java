public class palidrome_number {
 static int reversenum(int num){
        int revnum =0;
        while (num!=0) {
                int digit =num%10;
                revnum=revnum*10+digit;
                num =num/10;
        }
        return revnum;
                
       }

       static boolean ispalidrome(int num){
                int originalnum =num;
                int reversednum = reversenum(num);
                if (originalnum == reversednum) {
                        System.out.println("it is palindrome");
                        return true;
                }else{
                        System.out.println("it is not palindrome");
                        return false;
                }   
               
        }
        public static void main(String[] args) {
            System.out.println(ispalidrome(121));    
        }
}
