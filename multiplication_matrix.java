import java.util.*;

public class multiplication_matrix {
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
        if (c1 == r2) {
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
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    for (int k = 0; k < r1; k++) {
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                }
            }
              System.out.println("Matrix multiplication of A and B:");
               for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        } else {
            System.out.print("Matrix doesn't exitst");
        }
        sc.close();
    }
}
