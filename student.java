public class student{
        public int id;
        public int age;
        public String name;
        public int nos; 
        public student(){
                System.out.println("Student Default   ctor called ");
        }
        public void study(){
                System.out.println(name+"Studying");
        }
        public void sleep(){
                System.out.println(name+"sleeping");
        }
        public void bunk(){
         System.out.println(name+"Bunking");   
        }
}
