/**
 * insertatbegning
 */
public class insertatbegning {
        public static class Node{
                int data;Node next;
                Node(int data){
                this.data =data;
                }
        }
        public static class linkedList{
                Node head = null;
                Node tail = null;
                void insertAtEnd(int val){
                        Node temp=new Node(val);
                        if(head == null){
                                head=temp;
                        }else{
                                tail.next =temp;
                        }  tail =temp;
                
                }void insertatHead(int val){
                        Node temp =new Node(val);
                        if(head == null){
                                head =tail =temp;
                        }
                        else{
                                temp.next =head;
                                head=temp;
                        }
                }
                
                
                
                
                
                
                
                
                void  display(){
                        Node temp=head;
                       while (temp!=null) {
                        System.out.println(temp.data+" ");
                        temp=temp.next;
                        
                       }
                      
                } int size(){
                        Node temp =head;
                        int count=0;
                        while (temp!=null) {
                                count++;
                                temp =temp.next;
                                
                        }return count;
                       }
        }
        public static void main(String[] args) {
                linkedList ll =new linkedList();
               ll.insertatHead(10);
                ll.insertAtEnd(4);
                ll.insertAtEnd(5);
                ll.insertAtEnd(6);
               ll.display();
              System.out.println(ll.size()); 

        }

}
