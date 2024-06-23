import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Optional;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;

public class Stream_fun {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 1, 4, 3, 2, 6,1,2);
        System.out.println("givenList : " + nums);
        int a = nums.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("maxValue : " + a);
        int b = nums.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println("minValue : "+b);
        int c = nums.stream().mapToInt(Integer::intValue).sum();
        Optional<Integer> sum = nums.stream().reduce((x,y)->x+y);
        System.out.println(sum.get());
        System.out.println("sum : "+c);
        double d = nums.stream().mapToInt(Integer::intValue).average().orElse(1);
        System.out.println("average : "+d);
        long count = nums.stream().mapToInt(Integer::intValue).count();
        System.out.println("count : "+count);
       List<Integer> e = nums.stream().sorted().toList();
       System.out.println("sortedStream : "+e);
       int f = nums.stream().mapToInt(Integer::intValue).filter(n->n%2==0).sum();
       System.out.println("EvenSum : "+f);
       int g = nums.stream().mapToInt(Integer::intValue).filter(n->n%2==1).sum();
       System.out.println("OddSum : "+g);
       List<Integer> h = nums.stream().distinct().collect(Collectors.toList());
       System.out.println("distinct : "+h);
    }
}