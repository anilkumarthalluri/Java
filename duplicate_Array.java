import java.util.*;

public class duplicate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of Array:");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.print("Enter elements of Array:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.print("Array elements:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("Duplicate values:");
        for(int i=0;i<n+2;i++){
            if(A[i]==A[i+1]){
                System.out.print(A[i]+" ");
            }
        }
        System.out.println();
        sc.close();
    }
}