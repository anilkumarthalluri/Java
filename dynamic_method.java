public class dynamic_method{
    public static void main(String[] args){
       A obj = new A();
       obj.show();
       obj=new B();
       obj.show();
       obj=new C();
       obj.show();
    }
}
class A{
    void show(){
        System.out.println("Hello world! in A");
    }
}
class B extends A{
    void show(){
        System.out.println("Hello world! in B");
    }
}
class C extends A{
    void show(){
        System.out.println("Hello world! in C");
    }
}