public class Studentclass { 
    public static class Student { 
        String name; 
        int rno; 
        double percent; 
    } 
 
    public static void main(String[] args) { 
        Student x = new Student(); 
        x.name = "Gaurav"; 
        x.percent = 95.6; 
        System.out.println(x.name); 
    } 
} 