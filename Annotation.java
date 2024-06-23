class A{
    public void showinA(){
        System.out.println("Hello in A show");
    }
}
class B extends A{
    @Override
     public void showinA(){
        System.out.println("Hello in B show");
    }
}
public class Annotation{
    public static void main(String[] args){
        B obj = new B();
        obj.showinA();
    }
}