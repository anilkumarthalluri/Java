@FunctionalInterface
interface A{
    public abstract void show();
}
public class lambda {
    public static void main(String[] args){
        A obj = ()-> System.out.println("in A show");
        obj.show();
    }   
}