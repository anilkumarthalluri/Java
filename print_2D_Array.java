import java.util.*;
class print_2D_Array{
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int n;
    System.out.print("Enter size of Array:");
    n=obj.nextInt();
    int A[][]=new int[n][n];
    System.out.print("Enter elements of Array:");
    for(int i=0;i<A.length;i++){
      for(int j=0;j<n;j++){
      A[i][j]=obj.nextInt();
    }
  }
  System.out.println("Array elements are:");
    for(int i[]:A){
      for(int j:i){
        System.out.print(j+" ");
      }
      System.out.println();
    }
    obj.close();
  }
}