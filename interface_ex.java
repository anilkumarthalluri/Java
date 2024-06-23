interface A{
    int age = 20;
    String name = "Anil";
    void show();
}
class B implements A{
    public void show(){
        System.out.println("Hello.....I am");
    }
}
public class interface_ex{
    public static void main(String[] args){
      A obj = new B();
      obj.show();
      System.out.println("Name : "+A.name);
      System.out.println("Age : "+A.age);
    }
}