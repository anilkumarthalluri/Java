import java.util.*;
public class area_sqaure {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int side;
        System.out.print("Enter side of square:");
        side=obj.nextInt();
        System.out.print("Area of square:"+(side*side));
        obj.close();
    }
}
