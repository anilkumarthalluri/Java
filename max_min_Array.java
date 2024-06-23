import java.util.*;
class max_min_Array{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n,max,min;
        System.out.print("Enter size of Array:");
        n=obj.nextInt();
        int A[]=new int[n];
        System.out.print("Enter elements of Array:");
        for(int i=0;i<n;i++){
            A[i]=obj.nextInt();
        }
        System.out.print("Array elements of A:");
        for(int i=0;i<n;i++){
           System.out.print(A[i] +" ");
        }
        max=A[0];
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
              min=A[0];
        for(int i=0;i<n;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        System.out.println();
        System.out.print("maximum:"+max);
               System.out.println();
        System.out.print("minimum:"+min);
        obj.close();
    }
}