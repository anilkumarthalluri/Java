public class vehicle_inheritance {
   public static void main(String[]args){
    car sc=new car();
    sc.drive();
    sc.test();
   }
}
class car extends vehicle{
    void test(){
        System.out.println("Reparing a car");
     }
}
class vehicle{
      void drive(){
        System.out.println("The car is Rolls Roise");
    }
}