import java.util.*;

class string_palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1, str2 = "";
        int len;
        System.out.print("Enter string:");
        str1 = obj.nextLine();
        len = str1.length();
        for (int i = len - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println("String you entered " + str1);
        System.out.println("reverse string is " + str2);
        if(str1.equals(str2))
        System.out.println(str1+" is a palindrome");
        else
        System.out.println(str1+" is not a palindrome");
        obj.close();
    }
}