import java.util.*;

public class matrix_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, r2, c1, c2;
        System.out.print("Enter rows and columns of Matrix A:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.err.print("Enter rows and columns of Matrix B:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        int C[][] = new int[r1][c1];
         if (r1 == r2 && c1 == c2) {
        System.out.print("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter elements of Matrix B:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                B[i][j] = sc.nextInt();
            }
        }
       System.out.println("Addition of matrx A and Matrix B:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.print(C[i][j]+" ");
                }
                 System.out.println();
            }
           
        }
        else{
            System.out.print("Matrix doesn't exitst");
        }
        sc.close();
    }
}
