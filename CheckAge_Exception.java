import java.util.*;
class check{
    public void checkAge(int age){
       if(age<18){
        throw new ArithmeticException("Access denied - not enough age");
       }
       else{
        System.out.println("Access granted - you're so old");
       }
    }
}
public class CheckAge_Exception {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    check obj = new check();
    int age;
    System.out.print("Enter Your Age : ");
    age=sc.nextInt();
    obj.checkAge(age);
    sc.close();
   }   
}