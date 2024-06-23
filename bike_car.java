import java.util.*;
public class bike_car{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,bike,car,vehicle;
        System.out.print("Enter no.of wheels:");
        n=sc.nextInt();
        System.out.print("Enter number of vehicle:");
        vehicle=sc.nextInt();
        bike=0;
        car=0;
        while(n!=0){
            if((  bike+car)>vehicle)
             break;
             else{
            n=n-2;
            ++bike;
            n=n-4;
            ++car;
            vehicle=vehicle-2;
             }
        }
        System.out.println("bike:"+bike);
        System.out.println("car:"+car);
        sc.close();
    }
}