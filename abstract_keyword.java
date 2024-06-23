abstract class A{
    public abstract void Hello();
    public void HI(){
        System.out.print("I am ...");
    }
}
class B extends A{
    public void Hello(){
        System.out.print("Hello ");
    }
}
public class abstract_keyword{
    public static void main(String[] args){
        B obj = new B();
        obj.Hello();
        obj.HI();
    }
}