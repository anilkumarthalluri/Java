import java.util.*;
class consecutive{
    public void number(int x,int y,int z){
        if(y==x+1 && z==x+2 ){
            System.out.println("consecutive numbers");
        }
        else if(x==y-1 && z==y+1){
            System.out.println("consecutive numbers");
        }
        else if(z==y-1 && z==x-2){
            System.out.println("consecutive numbers");
        }
        else
        System.out.println("not cosecutive numbers");
    }
}
public class consecutive_number {
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    consecutive sc=new consecutive();
    int n1,n2,n3;
    System.out.print("Enter three numbers:");
    n1=obj.nextInt();
    n2=obj.nextInt();
    n3=obj.nextInt();
    System.out.print(n1+","+n2+","+n3+" ");
    sc.number(n1,n2,n3);
    obj.close();
  }  
}
