import java.util.HashSet;

public class HashSet_Compare {
    public static void main(String[] args){
        HashSet<String> set1 = new HashSet<>();
        set1.add("Anil");
        set1.add("Rakesh");
        set1.add("satwik");
        set1.add("Gowtham");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Anil");
        set2.add("kumar varma");
        set2.add("Ayush");
        set2.add("Ajay");
        System.out.println("Set 1 : "+set1);
        System.out.println("Set 2 : "+set2);
        set1.retainAll(set2);
        System.out.println("same names : "+set1);
        for(String i : set1){
            System.out.println(set1.contains(i)?"yes":"No");
        }
    }
}