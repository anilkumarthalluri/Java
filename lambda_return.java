@FunctionalInterface
interface A{
    public abstract int add(int i);
}
public class lambda_return {
    public static void main(String[] args){
        A obj =(i)->i;
        int x= obj.add(5);
        System.out.println("result : "+x);
    }   
}