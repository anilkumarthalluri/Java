import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterator{
    public static void main(String [] args){
        HashSet<String> num = new HashSet<String>();
        num.add("Red");
        num.add("Yellow");
        num.add("Red");
        num.add("Yellow");
        num.add("White");
        num.add("Black");
        Iterator<String> p =num.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}