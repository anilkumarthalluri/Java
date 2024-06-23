import java.lang.Thread;
import java.io.IOException;

// 0 - new
// 1 - Runnable
// 2 - Blocked
// 3 - waiting (Join)
// 4 - Timed-waiting (time sleep)
// 5 - Terminated

public class Thread_LifeCycle {
   public static void main(String[] args)throws IOException{
      A t1 = new A("Anil");
      System.out.println(t1.getState());
      t1.start();
      System.out.println(t1.getState());
     // System.out.println("ThreadName : "+Thread.currentThread().getName());
   }   
}

class A extends Thread{
    public A(String s){
        super(s);
    }
    @Override
    public void run(){
        System.out.println("Helo in A ");
        System.out.println("ThreadName : "+Thread.currentThread().getName());
    }
}