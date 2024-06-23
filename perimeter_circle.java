import java.util.*;
public class perimeter_circle {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int r;
        System.out.print("Enter radius of circle:");
        r=obj.nextInt();
        System.out.print("perimeter:"+(2*3.14*r));
       obj.close();
    }
}
