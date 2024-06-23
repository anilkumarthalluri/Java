import java.lang.Thread;
class A extends Thread{
    public void run(){
        System.out.println("This code is running inside Thread");
    }
}
public class Thread_ex{
    public static void main(String[] args){
        A obj = new A();
        obj.start();
        System.out.println("This code is running outside Thread");
    }
}