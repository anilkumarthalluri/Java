import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_Sort{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };
        num.add(55);
        num.add(81);
        num.add(20);
        num.add(18);
        num.add(94);
        Collections.sort(num,com);
        System.out.println(num);
    }
}