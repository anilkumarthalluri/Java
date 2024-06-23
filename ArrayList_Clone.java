import java.util.ArrayList;

public class ArrayList_Clone{
    public static void main(String[] args){
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(4);
        num1.add(2);
        num1.add(5);
        num1.add(1);
        num1.add(3);
        ArrayList<Integer> num2 = new ArrayList<Integer>(num1);
        //num2.addAll(num1);

        System.out.println("Original List : "+num1);
        System.out.println("Clone List : "+num2);
        ArrayList<Integer> num3 = new ArrayList<>();
        num3.addAll(num1);
        num3.addAll(num2);
        System.out.println("Adding two List : "+num3);
    }
}