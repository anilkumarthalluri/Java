import java.util.*;
public class perimeter_squre {
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       System.out.print("Enter side of sqaure:");
       int side;
       side=obj.nextInt();
       System.out.print("perimeter of square:"+(4*side));
       obj.close();
    }
}
