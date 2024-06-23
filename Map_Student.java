import java.util.Map;
import java.util.HashMap;

public class Map_Student{
    public static void main(String[] args){
        Map<String,Integer> student = new HashMap<String,Integer>();
        student.put("Anil",90);
        student.put("suresh",89);
        student.put("Ramesh",70);
        student.put("Anil",70);
        System.out.println(student);
        System.out.println(student.get("suresh"));
    }
}