import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Integer {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(8);
        num.add(2);
        num.add(5);
        num.add(1);
        num.add(9);
        System.out.print("ArrayList Through loop : ");
        for(int i=0;i<num.size();i++){
            System.out.print(num.get(i)+" ");
        }
        System.out.println();
        System.out.print("ArrayList Through forEach loop : ");
        for(int i : num){
            System.out.print(i+" ");
        }
        System.out.println();
        Collections.sort(num);
        System.out.println("ArrayList : "+num);
    }
}