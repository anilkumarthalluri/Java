import java.util.*;
class evenodd{
    public boolean number(int num){
       if(num%2==0)
       return true;
       else
       return false;
    }
}
public class even_odd {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        evenodd sc=new evenodd();
        int n;
        System.out.print("Enter number to check even or odd:");
        n=obj.nextInt();
        boolean x=sc.number(n);
        if(x)
        System.out.println(n+" is even");
        else
        System.out.println(n+" is odd");
        obj.close();
    }
}
