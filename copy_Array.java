import java.util.*;
class copy_Array{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.print("Enter size of Array:");
        n=obj.nextInt();
        int A[]=new int[n];
        int B[]=new int[n];
        System.out.print("Enter elements of Array:");
        for(int i=0;i<n;i++){
            A[i]=obj.nextInt();
        }
        System.out.print("Array elements of A:");
        for(int i=0;i<n;i++){
           System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("Array elements of B:");
        for(int i=0;i<n;i++){
             B[i]=A[i];
             System.out.print(B[i]+" ");
        }
        obj.close();
    }
}