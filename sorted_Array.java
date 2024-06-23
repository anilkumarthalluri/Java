import java.util.*;
public class sorted_Array {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n,temp=0;
        System.out.print("Enter size of Array:");
        n=obj.nextInt();
        int A[]=new int[n];
        System.out.print("Enter elements of Array:");
        for(int i=0;i<n;i++){
            A[i]=obj.nextInt();
        }
        System.out.print("Elements of Array:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("Sorted Array:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        obj.close();
    }
}