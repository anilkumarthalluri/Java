import java.lang.Thread;

class A extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
             System.out.println("Hi");
                  try{
                 Thread.sleep(10);
             }
            catch (InterruptedException e) {
                
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
             System.out.println("Hello");
             try{
                 Thread.sleep(10);
             }
            catch (InterruptedException e) {
                
            }
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj2.getPriority());
        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.start();
    }   
}