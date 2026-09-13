public class Displayinglinkedlist {
        public static class Node{
                int data;
                Node next;
                Node(int data){
                        this.data=data;

                }
        }
        public static void main(String args[]){
            Node sa =new Node(5);
            Node sb =new Node(4);
            Node sc =new Node(3);
            Node sd =new Node(2);
            Node se =new Node(1);
            sa.next=sb;
            sb.next =sc;
            sc.next=sd;
            sd.next =se;  
            Node temp =sa;
            //displying
                while (temp!=null) {
                System.out.print(temp.data+" ");
                temp =temp.next;     
                }
            
        }
}
