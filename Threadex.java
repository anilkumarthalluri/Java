import java.lang.Thread;

class A extends Thread{
    @Override
    public void run(){
        System.out.println("The Code running inside thread");
    }
}

public class Threadex{
    public static void main(String[] args){
        A obj = new A();
        obj.start();
         System.out.println("The Code running outside thread");
    }
}