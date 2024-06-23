import java.util.*;
class Rectangle{
    private int l;
    private int b;
    void setMeasurements(int l,int b){
        this.l=l;
        this.b=b;
    }
    int getLength(){
        return l;
    }
    int getBreadth(){
        return b;
    }
    int getMeasurements(){
        return l*b;
    }
}
public class Area_rectangle_encaps {
    public static void main(String[] args){
        Scanner obj=new  Scanner(System.in);
        Rectangle sc=new Rectangle();
        int l,b;
        System.out.print("Enter length and breadth:");
        l=obj.nextInt();
        b=obj.nextInt();
        sc.setMeasurements(l,b);
        System.out.println("length:"+sc.getLength());
        System.out.println("Breadth:"+sc.getBreadth());
        System.out.print("Area of Rectangle:"+sc.getMeasurements());
        obj.close();
    }
}
