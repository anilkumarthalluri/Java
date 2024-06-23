import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Insert {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(3);
        num.add(1);
        num.add(2);
        num.add(4);
        System.out.println("Before insrting : "+num);
        num.add(0,0);
        Collections.sort(num);
        num.set(3,5);
        System.out.println("After Inserting : "+num);
        num.remove(3);
        System.out.println("After remove : "+num);
        if(num.contains(5)){
            System.out.println(5+" Element was found ");
        }
        else
        System.out.println("Element not found");
    }
}