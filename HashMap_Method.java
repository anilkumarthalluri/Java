import java.util.HashMap;

public class HashMap_Method{
    public static void main(String[] args){
        HashMap<String, Integer> num = new HashMap<>();
        num.put("Anil",1);
        num.put("Ramu", 4);
        num.put("Ravi",5);
        num.put("Karthik",2);
        System.out.println("Normal HashMap : ");
        System.out.println(num);
        System.out.println("After Updating..");
        num.remove("Ravi");
        System.out.println(num);
        System.out.println(num.get("Anil"));
        for(String i : num.keySet()){
            System.out.println(i);
        }
        for(Integer i : num.values()){
            System.out.println(i);
        }
        num.clear();
        System.out.println(num);
    }
}