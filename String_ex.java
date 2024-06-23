
public class String_ex{
    public static void main(String[] ars){
        StringBuffer obj1 = new StringBuffer("Hello");
        StringBuffer obj2 = new StringBuffer("Hello");
        System.out.println(obj1 == obj2);//it compares addresses of objects
        System.out.println(">>>>>>>>>>>>>>>");
        String s1 = "Anil";
        String s2 = "Anil";
        System.out.println(s1 == s2); //it compares data o objects
    }
}