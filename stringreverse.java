public class stringreverse {
        static String stringrev(String str,int idx){
                if (str.length()==idx) return " ";
        return stringrev(str, idx+1)+str.charAt(idx);
        }

        public static void main(String[] args) {
                String str ="Gaurav";
                int idx =0; 
                System.out.println(stringrev(str,idx));
        }
}