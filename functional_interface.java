@FunctionalInterface
interface A{
 void show();
}
public class functional_interface {
    public static void main(String[] args){
        A obj = new A(){
            public void show(){
                System.out.println("Hello in A ");
            }
        };
        obj.show();
    }
}