import java.util.*;
public class uppercase_string {
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       String str;
       System.out.print("Enter string:");
       str=obj.nextLine();
       System.out.println(str.toUpperCase());
       obj.close();
    }
}
