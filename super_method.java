class A{
    public void show(){
        System.out.println("in show A");
    }
}
class B extends A{
    public void hello(){
        super.show();
    }
    public void show(){
        System.out.println("in show B");
    }
}
public class super_method {
   public static void main(String[] args){
    B obj = new B();
    obj.hello();
   }   
}