import java.lang.Thread;
import java.lang.Exception;
class A extends Thread{
    public void run(){
        System.out.println("This Code is Running inside Thread");
    }
}
public class Thread_Order {
   public static void main(String[] args) throws Exception{
       A obj = new A();
       obj.start();
       try{
         obj.join();
       }
      catch(InterruptedException e){
        System.out.println("Code interrputed..");
      }
       System.out.println("This Code is Running outside Thread");
   }   
}