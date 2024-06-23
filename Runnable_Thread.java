import java.lang.Thread;

public class Runnable_Thread{
    public static void main(String[] args){
        A obj1 = new A();
        Thread T1 = new Thread(obj1,"Thread1");
        T1.start();
        B obj2 = new B();
        Thread T2 = new Thread(obj2,"Thread2");
        T2.start();
    }
}

class A implements Runnable{
    @Override
    public void run(){
        System.out.println("Helo in A : "+Thread.currentThread().getName());
    }
}

class B implements Runnable{
    @Override
    public void run(){
        System.out.println("Helo in B : "+Thread.currentThread().getName());
    }
}