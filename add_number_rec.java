import java.util.*;
class number{
    public int add(int n){
        if(n>0){
        return  n+add(n-1);    
        }
        else{
         return 0;
        }
      
    }
}
public class add_number_rec {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        number sc=new number();
        int n;
        System.out.print("Enter number:");
        n=obj.nextInt();
        System.out.println("sum of numbers b/w 0 and "+n+" : "+" "+sc.add(n));
        obj.close();
    }
}
