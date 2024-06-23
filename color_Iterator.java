import java.util.ArrayList;
import java.util.Iterator;

public class color_Iterator{
    public static void main(String[] args){
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        Iterator<String> set = color.iterator();
        System.out.println("First item : "+set.next());
        System.out.print("Loop through Iterator : ");
        while(set.hasNext()){
            System.out.print(set.next()+" ");
        }
    }
}