import java.util.*;
public class multiplication_table {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        int range,n;
        System.out.print("Enter number:");
        n=sc.nextInt();
        System.out.print("Enter range:");
        range=sc.nextInt();
        for(int i=1;i<=range;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
        sc.close();
    }
}
