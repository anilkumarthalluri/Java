class Vehicle{
    public void speedUp(){
        System.out.println("Vehicle Avg.speed is 60Km/Hr");
    }
}
class Car extends Vehicle{
    public void speedUp(){
       System.out.println("Car speed is 120Km/Hr");
    }
}
class bicycle extends Vehicle{
   public void speedUp(){
       System.out.println("bicycle speed is 10Km/Hr");
   }
}
public class Vehicle_Polymorphism {
 public static void main(String[] args){
      Vehicle obj1 = new Vehicle();
      obj1.speedUp();
      Car obj2 = new Car();
      obj2.speedUp();
      bicycle obj3 = new bicycle();
      obj3.speedUp();
  }   
}