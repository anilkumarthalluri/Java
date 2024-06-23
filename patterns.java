import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int rows,columns;
        System.out.print("Enter no.of rows and columns:");
        rows = obj.nextInt();
        columns=obj.nextInt();
        for (int i= 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
        obj.close();
    }
}
