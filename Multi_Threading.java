import java.lang.Thread;

public class Multi_Threading{
    public static void main(String[] args){
        A obj1 = new A("Thread1");
        obj1.start();
        System.out.println(Thread.activeCount());
        B obj2 = new B("Thread1");
        obj2.start();
    }
}

class A extends Thread{
    public A(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Helo in A "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }
}

class B extends Thread{
   public B(String tName){
        super(tName);
    }
    @Override
    public void run(){
        System.out.println("Helo in B " +Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }
}