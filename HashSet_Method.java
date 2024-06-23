import java.util.HashSet;

public class HashSet_Method {
     public static void main(String[] args){
        HashSet<String> num = new HashSet<>();
        System.out.print("Before Updating : ");
        num.add("Anil");
        num.add("Karthik");
        num.add("Raghav");
        num.add("Anil");
        num.add("Ramesh");
        System.out.println(num);
        num.remove("Ramesh");
        System.out.print("After Updaing : ");
        System.out.println(num);
        System.out.println("Set Size : "+num.size());
        System.out.print("Set through loop : ");
        for(String i : num){
            System.out.print(i+" ");
        }
        num.clear();
        System.out.println("\nAfter updaing set Size : "+num.size());
     }
}