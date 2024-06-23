import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_reverse{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(3);
        System.out.println("ArrayList Before sorting : "+num);
        Collections.sort(num);
        System.out.println("ArrayList After sorting : "+num);
        Collections.reverse(num);
        System.out.println("reverse ArrayList : "+num);
    }
}