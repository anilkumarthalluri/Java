
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Array_List{
    public static void main(String [] args){
        List<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(8);
        num.add(6);
        num.add(4);
        System.out.println("ArrayList size : "+num.size());
        System.out.println("Beore Sorting : "+num);
        Collections.sort(num);
        System.out.println("After Sorting : "+num);
        num.set(2,10);
        System.out.println("After Updating List : "+num);
        num.remove(2);
        System.out.println("After removing Element : "+num);
        num.clear();
        System.out.println("After clearing : "+num);
    }
}