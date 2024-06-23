import java.util.*;
public class string_concatenate {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String str1,str2;
        System.out.print("Enter first string:");
        str1=obj.nextLine();
        System.out.print("Enter second string:");
        str2=obj.nextLine();
        System.out.print(str1+" "+str2);
        obj.close();
    }
}
