import java.util.ArrayList;
/*arr →1,4,3,4
target →4
ans(arraylist)→{1,3}*/ 

public class findallindicesarraylist {
static ArrayList<Integer> allindice(int []a,int n,int target ,int idx){
          if(idx>=n){
                return new ArrayList<Integer>();
          }
          ArrayList<Integer>ans =new ArrayList<>();
          if(a[idx]==target){
                ans.add(idx);  
          }
       ArrayList<Integer> smallAns=   allindice(a, n, target, idx+1);
       ans.addAll(smallAns);
       return ans;
}
        public static void main(String[] args) {
                int [] a={1,2,4,4,3,4};
                int target =4;
                int n =a.length;
                ArrayList<Integer>ans = allindice(a, n, target, 0);
                for (Integer i:ans){
                        System.out.println(i);
                }
        }
        
}
