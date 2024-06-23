import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
//import java.util.stream.Stream;

public class Stream_Number_API{
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,5,4,2,3);
        System.out.println("givenList : "+nums);
       List<Integer> obj = nums.stream()
        .map(e->String.valueOf(e))
        .filter(e->e.startsWith("2"))
        .map(Integer::valueOf)
        .collect(Collectors.toList());
        System.out.println(obj);
    }
}