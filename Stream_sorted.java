import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Stream_sorted {
    public static void main(String[] args){
        List<String> list = Arrays.asList("zoya","Anil","pandit","balu");
        System.out.println("givenList : "+list);
       List<String> ascendingOrder = list.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println("sortedList : "+ascendingOrder);
       List<String> descendingOrder = list.stream()
        .sorted(Comparator.reverseOrder())
        .toList();
        System.out.println("reveseList : "+descendingOrder);
    }   
}