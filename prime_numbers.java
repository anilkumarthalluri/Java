import java.util.*;
class prime{
    public void range(int n){
        int flag=0;
     for(int i=1;i<=n;i++){
        if(n%i==0)
        flag++;
     }
      if(flag==2)
      System.out.println(n+" "+"is a prime number");
      else
      System.out.println(n+" "+"is not a prime number");
    }
}
public class prime_numbers {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        prime sc = new prime();
        int n;
        System.out.print("Enter number:");
        n=obj.nextInt();
        sc.range(n);
        obj.close();
    }
}
