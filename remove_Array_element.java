import java.util.*;
public class remove_Array_element {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n,index,x=0;
        System.out.println("Enter size of Array:");
        n=obj.nextInt();
        int A[]=new int[n];
        System.out.print("Enter Array elements:");
        for(int i=0;i<n;i++){
            A[i]=obj.nextInt();
        }
        System.out.print("Array elements:");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println();
         System.out.print("Enter index to remove:");
         index=obj.nextInt();
         for(int i=0;i<n;i++){
            if(i==index){
                x=A[i];
            }
         }
         System.out.print("After deleting deleting "+x+" element:");
         for(int i=0;i<index;i++){
             System.out.print(A[i]+" ");
         }
         for(int i=index+1;i<n;i++){
             System.out.print(A[i]+" ");
        obj.close();
    }
}
}