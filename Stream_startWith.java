import java.util.List;
import java.util.Arrays;
//import java.util.stream.Stream;

public class Stream_startWith {
    public static void main(String[] args){
        List<String> obj = Arrays.asList("Anil","Ram","Amith","tyson","Ayush");
        System.out.println(obj);
        long count = obj.stream()
        .filter(s->s.startsWith(String.valueOf("A"))).count();
        System.out.println("startsWith A : "+count);
       List<String> list= obj.stream()
        .filter(s->s.startsWith(String.valueOf("A"))).toList();
        System.out.println(list);
    }   
}