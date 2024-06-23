import java.util.*;
public class present_Array {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n,target,count=0;
        System.out.print("Enter size of Array:");
        n=obj.nextInt();
        int A[]=new int[n];
        System.out.print("Enter elements of Array:");
        for(int i=0;i<n;i++){
            A[i]=obj.nextInt();
        }
        System.out.print("Array elements:");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Enter element to search:");
        target=obj.nextInt();
        for(int i:A){
            if(i==target){
                count++;
            }
        }
        if(count>0)
        System.out.println(target+" is found "+count+"  times");
        else
              System.out.println(target+" is not found");
        obj.close();
    }
}
