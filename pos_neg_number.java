import java.util.*;
public class pos_neg_number {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.print("Enter number to check +ve or -ve:");
        n=obj.nextInt();
        if(n>0)
        System.out.print(n+" is +ve number");
        else
        System.out.print(n+" is -ve number");
        obj.close();
    }
}
