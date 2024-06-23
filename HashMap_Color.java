import java.util.HashMap;

public class HashMap_Color{
    public static void main(String[] args){
        HashMap<Integer, String> color = new HashMap<>();
        color.put(1,"Red");
        color.put(2,"Green");
        color.put(3,"Yellow");
        color.put(4,"Red");
        System.out.println("Map : "+color);
        System.out.println("Map Size : "+color.size());
      //  color.clear();
        if(color.isEmpty()){
            System.out.println("Map is Empty : "+color);
        }
        else
        System.out.println("Map is not Empty : "+color);
    }
}