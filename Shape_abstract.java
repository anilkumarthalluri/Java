abstract class Shape{
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
class Circle extends Shape{
    int r=4;
    public void calculateArea(){
         
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
    public void calculatePerimeter(){
       System.out.println("Perimeter of Circle : "+(2*3.14*r));
    }
}
class Triangle extends Shape{
    int h=2,b=8;
       public void calculateArea(){
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void calculatePerimeter(){
        int a=2,b=3,c=9;
         System.out.println("Perimeter of Trianle : "+(a+b+c));
    }
}
public class Shape_abstract {
    public static void main(String[] args){
        Circle c = new Circle();
        Triangle t = new Triangle();
        c.calculateArea();
        c.calculatePerimeter();
        t.calculateArea();
        t.calculatePerimeter();
    }
}