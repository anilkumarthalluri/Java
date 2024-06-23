import java.lang.Thread;

public class current_Thread{
    public static void main(String [] args){
        System.out.println("Thread : "+Thread.currentThread().getName());
        System.out.println("Thread Id : "+Thread.currentThread().getId());
        System.out.println("Thread class : "+Thread.currentThread().getClass());
        System.out.println("Active Threads : "+Thread.activeCount());
        System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
    }
}