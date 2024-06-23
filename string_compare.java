import java.util.*;
public class string_compare {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String str1,str2;
        int x;
        System.out.print("Enter first string:");
        str1=obj.nextLine();
        System.out.print("Enter second string:");
        str2=obj.nextLine();
        x=str1.compareTo(str2);
        if(x<0)
        System.out.print(str1+" is less than "+str2+" by "+x);
        else if(x>0)
        System.out.print(str1+" is greater than "+str2+" by "+x);
        else
        System.out.print("Strings are equal");
        obj.close();
    }
}
