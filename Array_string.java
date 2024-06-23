import java.util.*;
public class Array_string{
   public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    String str;
    System.out.print("Enter string:");
    str=obj.nextLine();
    char[] Arr=str.toCharArray();
    System.out.print("String to Array:");
    System.out.print(Arr);
    obj.close();
   }
}