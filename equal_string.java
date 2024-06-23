import java.util.*;

public class equal_string {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter first string:");
        str1=obj.nextLine();
        System.out.print("Enter second string:");
        str2=obj.nextLine();
        if(str1.equals(str2))
        System.out.print("String are equal");
        else
        System.out.print("Strings are not equal");
        obj.close();
    }
}