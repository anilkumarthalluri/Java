import java.util.*;
import java.util.stream.Stream;

public class ex {
   public static void main(String [] args){ 
      List<Integer> num = Arrays.asList (7,1,3,8,2);
      Stream<Integer> s1 = num.stream();
      Stream<Integer> s2 = s1.filter(n->n%2==0);
      Stream<Integer> s3 = s2.map(n->n*3);
      s3.forEach(n->System.out.println(n));
   }   
}