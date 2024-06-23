 class Animal extends cat{
    void Makesound(){
      System.out.println("Make sound");
    }
}
class cat{
      void Bark(){
        System.out.println("Bark like Dog");
      }
}
public class inheritance_animal{
    public static void main(String[] args){
        Animal sc=new Animal();
        sc.Makesound();
        sc.Bark();
    }
}