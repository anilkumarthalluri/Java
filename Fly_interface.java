interface flyable{
    void fly_obj();
}

class Spacecraft implements flyable{
     public void fly_obj(){
         System.out.println("Spacecrat is flying...");
     }
}

class Aeroplane implements flyable{
       public void fly_obj(){
        System.out.println("Aeroplane is flying...");
     }
}

class Helicopter implements flyable{
       public void fly_obj(){
        System.out.println("Helicopter is flying...");
     }
}

public class Fly_interface {
    public static void main(String[] args){
       Spacecraft obj1 = new Spacecraft();
       obj1.fly_obj();
       Aeroplane obj2 = new Aeroplane();
       obj2.fly_obj();
       Helicopter obj3 = new Helicopter();
       obj3.fly_obj();
    }
}