import java.util.*;

public class sub_string {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1, str2;
        System.out.print("Enter Main string:");
        str1 = obj.nextLine();
        System.out.print("Enter sub_string to check in given main string:");
        str2 = obj.nextLine();
        if (str1.contains(str2))
            System.out.print(str2 + " is present");
        else
            System.out.print(str2 + " is not present");
        obj.close();
    }
}
