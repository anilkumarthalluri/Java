import java.util.*;
class Circle{
    private int r;
    void setRadius(int r){
      this.r=r;
    }
    int getRadius(){
        return r;
    }
    float getArea(){
        return (3.14f*r*r);
    }
    float getPerimeter(){
        return (2*3.14f*r);
    }
}
public class Area_Circle_encaps {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        Circle sc=new Circle();
        int r;
        System.out.print("Enter radius of Circle:");
        r=obj.nextInt();
        sc.setRadius(r);
        System.out.println("Radius:"+sc.getRadius());
        System.out.println("Area:"+sc.getArea());
        System.out.println("perimeter:"+sc.getPerimeter());
        obj.close();
    }
}
