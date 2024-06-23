import java.lang.Thread;
import java.lang.Runnable;
import java.io.IOException;

public class Thread_Annonymous {
    public static void main(String[] args) throws IOException{
        Runnable r1 = ()->{
            for(int i = 0 ; i< 10 ; i++){
               System.out.println("Helo : "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId()); 
               try{
                Thread.sleep(90);
               }
               catch(InterruptedException e){

               }
            }
         };
        // Runnable r1 = new Runnable(){
        //     public void run(){
        //         System.out.println("helo");
        //     }
        // };
        Runnable r2 = ()->{
            for(int i = 0 ; i<10 ; i++){
            System.out.println("Hi : "+Thread.currentThread().getName()+" : "+Thread.currentThread().getId());
            try{
                Thread.sleep(90);
            }
            catch(InterruptedException e){

            }
        }
     };
        Thread t1 = new Thread(r1,"Anil");
        Thread t2 = new Thread(r2,"tyson");

        t1.start();
        // try{
        //     t1.join();
        // }catch(InterruptedException e){

        // }
        
        t2.start();

       // System.out.println("Total Threads : "+Thread.activeCount());

    }
}