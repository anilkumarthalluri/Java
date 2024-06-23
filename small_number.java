import java.util.*;
class smallNumber{
    public int number(int num1,int num2,int num3){
        if(num1<num2 && num1<num3)
        return num1;
        else if(num2<num1 && num2<num3)
        return num2;
        else
        return num3;
    }
}
public class small_number {
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    smallNumber sc=new smallNumber();
      int a,b,c;
      System.out.print("Enter three numbers:");
      a=obj.nextInt();
      b=obj.nextInt();
      c=obj.nextInt();
      System.out.println("numbers:"+a+" "+b+" "+c);
      int result=sc.number(a,b,c);
      System.out.println("Small number is:"+result);
      obj.close();
    }
}
