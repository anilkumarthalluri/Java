import java.util.*;
public class area_circle {
    public static void main(String[] args){
        Scanner area=new Scanner(System.in);
        int r;
        System.out.println("Enter Radius of circle:");
        r=area.nextInt();
        System.out.println("Area="+(3.10*r*r));
        area.close();
    }
}
