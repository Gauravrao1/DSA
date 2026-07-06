public class constructor {
        public static void main(String[] args) throws Exception {
                student A =new student();
                A.id =1;
                A.age = 14; 
                A.name ="Ranu"; 
                A.nos =5;
                System.out.println(A.name); 
                System.out.println(A.age); 
                System.out.println(A.id);
                System.out.println(A.nos); 

                A.bunk();
                A.study();
                A.sleep();   

        }
}
