import java.util.ArrayList;
import java.util.List;

public class ArrayList_sublist{
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(3);
        List<Integer> num1 = num.subList(2,5);
        System.out.println("ArrayList : "+num);
       // System.out.println("subList : "+num.subList(2, 5));
        System.out.println("subList : "+num1);
        num.clear();
        if(num.isEmpty())
        {
            System.out.println("List is Empty : "+num);
        }
        else
        System.out.println("List is not Empty : "+num);
    }
}