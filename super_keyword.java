class Animal{
   String color = "Black";
}
class Dog extends Animal{
    String color = "White";
    public void show(){
       System.out.println(color);
       System.out.println(super.color);
    }
}
public class super_keyword {
  public static void main(String[] args){
      Dog obj = new Dog();
      obj.show();
  }   
}