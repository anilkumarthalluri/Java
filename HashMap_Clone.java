import java.util.HashMap;

public class HashMap_Clone {
    public static void main(String[] args){
        HashMap<Integer,String> color = new HashMap<Integer,String>();
        HashMap<Integer,String> copy = new HashMap<>();
        color.put(1,"Red");
        color.put(2,"Green");
        color.put(3,"yellow");
        color.put(4,"Black");
        System.out.println(color.get(3));
        System.out.println("Original Map : "+color);
        copy.putAll(color);
        System.out.println("Clone Map : "+copy);
    }   
}