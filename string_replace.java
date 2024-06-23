import java.util.*;

public class string_replace {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1, str2, x;
        System.out.print("Enter Main string:");
        str1 = obj.nextLine();
        System.out.print("Enter string to delete:");
        x = obj.nextLine();
        if (str1.contains(x)) {
            System.out.print("Enter string to replace:");
            str2 = obj.nextLine();
            str1 = str1.replace(x, str2);
            System.out.println(str1);
        } else {
            System.out.print(x + " string is not found to delete");
        }
        obj.close();
    }
}
