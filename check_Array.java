import java.util.*;
public class check_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter size of Array:");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.print("Enter elements of Array:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(A[i]>0){
                count++;
            }
        }
        if(count==0)
            System.out.print("Array is irregular");
        else
               System.out.print("Array is +ve");
        
        sc.close();
    }
}
