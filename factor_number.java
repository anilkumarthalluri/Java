import java.util.*;

class factor {
    public void number(int num) {
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.print(i+",");
            }
        }
    }
}

public class factor_number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        factor sc = new factor();
        int n;
        System.out.print("Enter number:");
        n = obj.nextInt();
        System.out.print("factors are:");
        sc.number(n);
        obj.close();
    }
}