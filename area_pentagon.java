import java.util.*;
class pentagon{
    public float number(int s){ 
        float x;
        x=5.29f*s;
        return x;
    }
}
public class area_pentagon {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        pentagon sc=new pentagon();
        int side;
        System.out.println("Enter side of pentagon:");
        side=obj.nextInt();
       float x=sc.number(side);
       System.out.println(x);
        obj.close();
    }
}
