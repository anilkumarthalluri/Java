import java.util.HashSet;

public class HashSet_Array {
    public static void main(String[] args){
        HashSet<String> num = new HashSet<String>();
        num.add("Anil");
        num.add("Rakesh");
        num.add("Satwik");
        num.add("Anil");
        num.add("Ram");
        String[] A = new String[num.size()];
        num.toArray(A);
        System.out.println("Original Set : "+num);
        System.out.print("Array: ");
        for(String i : A){
            System.out.print(i+" ");
        }
        
    }   
}