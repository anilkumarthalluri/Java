interface A{
    public abstract void Hi();
}
interface B{
    public abstract void Hello();

    public abstract void show();
}
class C implements A,B{
    public void Hi(){
        System.out.println("HI");
    }
    public void Hello(){
        System.out.println("Hello");
    }
}
public class multiple_interface {
    public static void main(String[] args){
        C obj = new C();
        obj.Hi();
        obj.Hello();
     }
}