import java.util.HashSet;

public class HashSet_Color{
    public static void main(String [] args){
        HashSet<String> num = new HashSet<String>();
        num.add("Red");
        num.add("Yellow");
        num.add("Red");
        num.add("Yellow");
        num.add("White");
        num.add("Black");
        System.out.println("Set : "+num);
        num.clear();
        if(num.isEmpty()){
            System.out.println("Set is Empty : "+num);
        }
        else
        System.out.println("Set is not Emtpy : "+num);
    }
}