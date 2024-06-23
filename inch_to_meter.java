import java.util.*;
class inch_to_meter{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int inch;
        float x;
        System.out.print("Enter Inch:");
        inch=obj.nextInt();
        x=inch*0.254f;
        System.out.print("meters:"+x+"m");
        obj.close();
    }
}