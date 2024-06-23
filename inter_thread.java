import java.lang.Thread;

class inter_thread{
    public static void main(String[] args){
       final customer c = new customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(5000);
            }
        }.start();
    }
}

class customer{
    int amount = 10000;
    synchronized void withdraw(int amount){
          System.out.println("going to withdraw...");
        if(this.amount<amount){
          System.out.println("less amount");
          try{
              wait();
          }catch(InterruptedException e){
              
        }
    }
    this.amount-=amount;
    System.out.println("withdraw completed....");
}
synchronized void deposit(int amount){
    System.out.println("going to deposit....");
    this.amount+=amount;
    System.out.println("deposit completed....");
    notify();
}
}