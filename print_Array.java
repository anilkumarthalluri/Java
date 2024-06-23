import java.util.*;
public class print_Array {
   public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int n;
    System.out.print("Enter size of Array:");
     n=obj.nextInt();
    int A[]=new int[n];
    System.out.print("Enter elements of Array:");
    for(int i=0;i<n;i++){
       A[i]= obj.nextInt();
    }
    System.out.print("Array elements are:");
    for(int i=0;i<n;i++){
        System.out.print(A[i]+" ");
    }
    obj.close();
   } 
}
