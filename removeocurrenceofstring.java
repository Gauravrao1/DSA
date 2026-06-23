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

 static String removeoccurence2(String str){
        if (str.length()==0) return " ";
        String smallAns = removeoccurence2(str.substring(1));
        char currChar =str.charAt(0);
        if(currChar != 'a'){
                return currChar+smallAns;
        }return smallAns;
}        public static void main(String[] args) {
                String str ="abcax";
                int idx =0;
             System.out.println(removeoccurence(str,idx));
             System.out.println(removeoccurence2(str));  
        }
}
