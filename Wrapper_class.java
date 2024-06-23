import java.util.Scanner;

public class Wrapper_class {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num=8;
        Integer num1=num;
        System.out.println(num);
        System.out.println(num1);
       int num2=num1;
       System.out.println(num2);
       String str="12";
       System.out.println(str);
       int num3=Integer.parseInt(str);
       System.out.println(num3*2);
        obj.close();
    }
}