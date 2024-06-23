import java.util.*;
class A{
    void show(String name){
        System.out.println("Name : "+name);
    }
    class B{
        void display(int age){
            System.out.println("Age : "+age);
        }
    }
}
public class inner_class{
    public static void main(String[] args){
       String name;
       int age;
       Scanner sc = new Scanner(System.in);
        A obj = new A();
        A.B obj1 = obj.new B();
       System.out.print("Enter Your name : ");
       name = sc.nextLine();
       System.out.print("Ente Your Age : ");
       age=sc.nextInt();
       obj.show(name);
       obj1.display(age);
       sc.close();
    }
}