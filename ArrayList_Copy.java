import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Copy {
    public static void main(String[] args){
        ArrayList<String> num1 = new ArrayList<String>();
        ArrayList<String> num2 = new ArrayList<String>();
        num1.add("4");
        num1.add("2");
        num1.add("1");
        num1.add("3");
        num2.add("Anil");
        num2.add("Ravi");
        num2.add("rakesh");
        num2.add("ruthvik");
        System.out.println("List 1 : "+num1);
        System.out.println("List 2 : "+num2);
        Collections.copy(num1,num2);
        System.out.println("List 1 : "+num1);
    }   
}