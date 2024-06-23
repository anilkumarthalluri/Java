import java.util.*;

class factorial {
    int number(int n) {
        if (n != 0){
        return n * number(n - 1);
        }
        else{
           return 1;
        }
      
    } 
}

public class factorial_rec {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        factorial sc = new factorial();
        int n;
        System.out.print("Enter number:");
        n = obj.nextInt();
      int x= sc.number(n);
         System.out.println(n+"! is "+" "+x);
        obj.close();
    }
}