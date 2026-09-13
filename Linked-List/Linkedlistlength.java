public class Linkedlistlength {
        public static class Node {
                int data;Node next;
                Node(int dat){
                   this.data=data;
                }      
        }
         public static  int displength(Node head){
                int count =0;
                while(head!=null){
                count++;
                head=head.next;
                }
             return count;

        }
        public static void main(String[] args) {
                Node a =new Node(25);
                Node b=new Node(35);
                Node c=new Node(40);
                Node d =new Node(50);
                Node e =new Node(45);
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;
        System.out.println(displength(a));
                
        }
}
