import java.util.*;
class BankAccount{
    private int num;
    private int balance;
   void setNumber(int n){
     this.num=n;
  }
  void setBalance(int x){
     this.balance=x;
  }
  int getNumber(){
     return num;
  }
  int getBalance(){
    return balance;
  }
}
public class encaps_bank{
   public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int num;
     BankAccount sc=new BankAccount();
	System.out.print("Enter your Account Number:");
	num=obj.nextInt();
         sc.setNumber(num);
     sc.setBalance(10000);
     System.out.println(sc.getNumber());
     System.out.println(sc.getBalance());
     obj.close();
   }
}