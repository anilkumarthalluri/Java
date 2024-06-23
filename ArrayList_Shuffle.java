import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Shuffle{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(3);
        System.out.println("ArrayList : "+num);
        Collections.shuffle(num);
        System.out.println("Shuffle List : "+num);
    }
}