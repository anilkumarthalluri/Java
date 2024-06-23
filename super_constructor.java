class vehicle{
    vehicle(){
       System.out.println("transportation");
    }
}
class car extends vehicle{
    car(){
        super();
        System.out.println("Driving");
    }
    void bike(){
       System.out.println("Bike");
    }
}
public class super_constructor {
    public static void main(String[] args){
         car obj = new car();
        obj.bike();
    }
}