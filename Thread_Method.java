import java.lang.Thread;

public class Thread_Method {
    public static void main(String[] ars){
        A obj = new A();
        obj.start();
        System.out.println("Thread Alive : "+obj.isAlive());
    }   
}

class A extends Thread{
    @Override
    public void run(){
         System.out.println("Hello in A ");
    }
}