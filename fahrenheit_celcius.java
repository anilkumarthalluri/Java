import java.util.*;
public class fahrenheit_celcius{
    public static void main(String args[]){
        int f;
        float c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit:");
        f=sc.nextInt();
        c=(f-32)*5/9;
        System.out.println("celcius:"+c);
        sc.close();
    }
}