//String reverse using recusuion
public class pallidromestring {
static String stringrev(String str,int idx){
                if (str.length()==idx) return "";
        return stringrev(str, idx+1)+str.charAt(idx);
        }
        static boolean pallidromestringis(String str,int idx){
                 if (str.equals(stringrev(str, 0))) {
                        return true;
                 }return false;
        }

        public static void main(String[] args) {
                String str ="aya";
                int idx =0; 
                System.out.println(stringrev(str,idx));
                System.out.println(pallidromestringis(str,idx));
        }
}
        
