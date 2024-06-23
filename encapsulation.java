import java.util.*;
class person{
    private int age;
     void setAge(int age){
          this.age=age; 
      }
     int getAge(){
         return age;
      }
   }
public class encapsulation{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      int age;
      System.out.print("Enter age:");
      age=sc.nextInt();
      person p=new person();
      p.setAge(age);
      System.out.print("Age:"+p.getAge());
      sc.close();
   }
}