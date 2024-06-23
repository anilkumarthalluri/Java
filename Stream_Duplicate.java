import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Stream_Duplicate {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,10,1,10,20,10,40,20,20,1,40,30);
        System.out.println("givenList : "+nums);
       List<Integer> dup = nums.stream()
        .filter(n->Collections.frequency(nums,n)>1).collect(Collectors.toList());
        System.out.println("duplicate values : "+dup);
       Set<Integer> dupValue = nums.stream()
        .filter(n->Collections.frequency(nums,n)>1).collect(Collectors.toSet());
        System.out.println(dupValue);
       List<Integer> list1= nums.stream().limit(5).toList();
       System.out.println("limit : "+list1);
       Optional<Integer> l=nums.stream().limit(5).reduce((x,y)->x+y);
       System.out.println(l);
      List<Integer> sk= nums.stream().skip(5).toList();
      System.out.println("Skipped : "+sk);
     long sumsk= nums.stream().skip(5).reduce((x,y)->x+y).get();
     System.out.println("skiiped Elements sum : "+sumsk);
    }   
}