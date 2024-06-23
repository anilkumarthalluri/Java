import java.util.*;
public class pp {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int r,k=0;
        System.out.print("Enter no.of rows:");
        r=obj.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++k+" ");
            }
            System.out.println("\n");
        }
        obj.close();
    }
}
