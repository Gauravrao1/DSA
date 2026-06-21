//Remove all occurrences of 'a'From Sting s ="abcax"
public class removeocurrenceofstring {
 static String removeoccurence(String str,int idx){
        if (str.length()==idx) return " ";
        String smallAns = removeoccurence(str,idx+1);
        char currChar =str.charAt(idx);
        if(currChar != 'a'){
                return currChar+smallAns;
        }return smallAns;
}
        public static void main(String[] args) {
                String str ="abcax";
                int idx =0;
             System.out.println(removeoccurence(str,idx));  
        }
}
