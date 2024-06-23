import java.util.*;

public class start_string {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1, str2;
        System.out.print("Enter string:");
        str1 = obj.nextLine();
        System.out.print("Enter starting string:");
        str2 = obj.nextLine();
        boolean yes = str1.startsWith(str2, 0);
        if (yes) {
            System.out.print(str1 + " starts with " + str2);
        } else {
            System.out.print(str1 + " not starts with " + str2);
        }
        obj.close();
    }
}
