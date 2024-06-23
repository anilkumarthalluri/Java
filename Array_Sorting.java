import java.util.Arrays;

public class Array_Sorting{
    public static void main(String[] args){
        A obj = new A();
        int[] A = {5,2,4,3,1};
        System.out.print("Before Sorting : ");
        obj.show(A);
        Arrays.sort(A);
        System.out.println();
        System.out.print("After Sorting : ");
        obj.show(A);
    }
}

class A{
    public void show(int A[]){
       for(int i = 0 ; i < 5 ; i++){
         System.out.print(A[i]+" ");
       }
    }
}