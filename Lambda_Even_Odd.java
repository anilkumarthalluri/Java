public class Lambda_Even_Odd {
    public static void main(String[] args) {
        int A[] = { 1, 3, 2, 4, 5 };
        int B[] = new int[5];
        int C[] = new int[5];
       System.out.print("given Array : ");
       for(int i : A){
            System.out.print(i+" ");
       }
       System.out.println("");
        // for (int i = 0; i < 5; i++) {
        //     if (A[i] % 2 == 0) {
        //         B[i] = A[i];
        //     } else
        //         C[i] = A[i];
        // }
        // System.out.print("Even Array : ");
        // for (int i : B) {
        //     if(i!=0){
        //      System.out.print(i + " ");
        //     }
        // }
        // System.out.println(" ");
        // System.out.print("Odd Array : ");
        // for (int i : C) {
        //       if(i!=0){
        //      System.out.print(i + " ");
        //     }
        // }
        A obj = (int z[])->{
            for (int i = 0; i < 5; i++) {
            if (A[i] % 2 == 0) {
                B[i] = A[i];
            } else
                C[i] = A[i];
        }
        System.out.print("Even Array : ");
        for (int i : B) {
            if(i!=0){
             System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Odd Array : ");
        for (int i : C) {
              if(i!=0){
             System.out.print(i + " ");
            }
        }
        };
        obj.show(A);
    }
}

interface A{
    public abstract void show(int A[]);
}