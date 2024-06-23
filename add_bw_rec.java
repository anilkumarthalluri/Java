import java.util.*;
class add{
    int number(int a,int b){
          if(a!=b){
             return b+number(a,b-1);
          }
          else{
            return 0;
          }
    }
}
public class add_bw_rec {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        add obj=new add();
        int a,b,x;
        System.out.print("Enter starting number:");
        a=sc.nextInt();
        System.out.print("Enter ending number:");
        b=sc.nextInt();
        x=obj.number(a,b);
        System.out.print("sum of numbers b/w "+a+" and "+b+" : "+x);
        sc.close();
    }
}
