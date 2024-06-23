import java.util.List;
//import java.util.stream.Stream;
import java.util.Arrays;

public class Stream_API {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 5, 2, 0, 4, 3);
    // System.out.println("List : "+nums);
    // Stream<Integer> obj = nums.stream();
    // Stream<Integer> sortedData = obj.sorted();
    // System.out.print("Using forEach loop : ");
    // nums.forEach(n->System.out.print(n+" "));
    // System.out.println();
    // // System.out.print("Stream : ");
    // // obj.forEach(n->System.out.print(n+" "));
    // //obj.forEach(n->System.out.print(n+" ")); we can't use stream more than one
    // System.out.print("sorted order : ");
    // sortedData.forEach(n->System.out.print(n+" "));
    for (int i : nums) {
      System.out.print(i + " ");
    }
    System.out.println();
    nums.stream()
        .sorted()
        .filter(n -> n % 2 == 1)
        .map(n -> n * 2)
        .forEach(n -> System.out.println(n));
  }
}