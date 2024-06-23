import java.util.*;
class average{
    public int number(int num1,int num2,int num3){
        return (num1+num2+num3)/3;
    }
}
public class average_number {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        average sc=new average();
        int a,b,c;
        System.out.println("Enter three numbers:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        System.out.println("numbers:"+a+" "+b+" "+c);
         System.out.println("Average:"+sc.number(a,b,c));
        obj.close();
    }
}
