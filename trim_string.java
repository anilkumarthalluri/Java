import java.util.*;
public class trim_string {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String str;
        System.out.print("Ente string:");
        str=obj.nextLine();
        System.out.println(str.trim());
        obj.close();
    }
}
