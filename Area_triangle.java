import java.util.*;
class Triangle{
    public float Area(int base,int height){
        float x=1.5f*base*height;
        return x;
    }
}
public class Area_triangle {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Triangle sc = new Triangle();
        int base,height;
        System.out.print("Enter base and height of triangle:");
        base=obj.nextInt();
        height=obj.nextInt();
        float x=sc.Area(base,height);
        System.out.println("Area="+x);
        obj.close();
    }
}
