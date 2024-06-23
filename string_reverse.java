import java.util.*;
public class string_reverse {
   public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String name;
        int len;
        System.out.print("Enter string:");
        name=obj.nextLine();
        len=name.length();
        System.out.print("reverse string:");
        for(int i=len-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
        obj.close();
    }
}
