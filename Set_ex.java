import java.util.Set;
import java.util.TreeSet;

public class Set_ex{
    public static void main(String[] args){
        Set<Integer> num = new TreeSet<Integer>();
        num.add(90);
        num.add(2);
        num.add(45);
        num.add(1);
        System.out.println(num);
    }
}