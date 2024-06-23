import java.util.HashSet;

public class HashSet_Clone {
    public static void main(String[] args){
        HashSet<String> num = new HashSet<String>();
        num.add("Anil");
        num.add("Rakesh");
        num.add("Satwik");
        num.add("Anil");
        num.add("Ram");
        HashSet<String> p = new HashSet<>();
        p.addAll(num);
        System.out.println("Original Set : "+num);
        System.out.println("Clone Set : "+p);
    }   
}