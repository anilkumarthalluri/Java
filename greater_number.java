import java.util.*;
class greatnumber{
    public int number(int num1,int num2,int num3){
        if(num1>num2 && num1>num3)
        return num1;
        else if(num2>num3 && num2>num1)
        return num2;
        else
        return num3;
    }
}
public class greater_number {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        greatnumber sc=new greatnumber();
        int a,b,c;
        System.out.print("Enter three numbers:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        System.out.println("numbers:"+a+" "+b+" "+c);
        int result=sc.number(a,b,c);
        System.out.println("big number is:"+result);
        obj.close();
    }
}
