class Animal{
    public void Sound(){
        System.out.println("Animal Make sounds");
    }
}
class Bird extends Animal{
      public void Sound(){
        System.out.println("Birds Fly");
      }
}
class Cat extends Animal{
      public void Sound(){
        System.out.println("Cat makes Meow");
      }
}
public class Animal_Polymorphism{
    public static void main(String[] args){
         Animal obj1 = new Animal();
         obj1.Sound();
         Bird obj2 = new Bird();
         obj2.Sound();
         Cat obj3 = new Cat();
         obj3.Sound();
    }
}