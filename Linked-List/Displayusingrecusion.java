public class Displayusingrecusion {
      public  static class Node{
          int data;
          Node next;
          Node(int data){
          this.data=data;
         }   
 }
     public static void printlist(Node head){
          while(head!=null){
                System.out.print(head.data+" ");
                head =head.next;
          }

     }
          public static void main(String[] args) {
                Node head =new Node(5);
                Node b =new Node(15);
                Node c =new Node(20);
                Node d =new Node(25);
                Node e =new Node(35);
                head.next=b;
                b.next=c;
                c.next=d;
                d.next=e;
                printlist(head);

          }
      }  

