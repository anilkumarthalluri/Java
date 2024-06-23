import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_retrive {
    public static void main(String []args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        int n;
        num.add(4);
        num.add(5);
        num.add(1);
        num.add(3);
        num.add(2);
        System.out.println("Before Sorting : "+num);
        Collections.sort(num);
        System.out.println("After Sorting : "+num);
        n=num.get(3);
        System.out.println("Element at index 3 : "+n);
    }
}