import java.util.*;
class index{
     int number(int A[],int num){
        int x=0;
        for(int i=0;i<=num;i++){
            x=A[i];
        }
        return x;
    }
}
class find_index_number{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        index sc=new index();
        int n,index;
        System.out.print("Enter size of Array:");
        n=obj.nextInt();
        int A[]=new int[n];
        System.out.print("Enter elements of Array:");
        for(int i=0;i<n;i++){
            A[i]=obj.nextInt();
        }
        System.out.print("Array elements are:");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Enter index between 0 and "+n+":");
        index=obj.nextInt();
       int x=sc.number(A,index); 
       System.out.println(x+" is at "+index+" index");
        obj.close();
    }
}