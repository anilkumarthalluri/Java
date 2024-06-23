class A{
    void display(){
        System.out.print("Hello");
    }
}
public class Anonymous_inner_class {
    public static void main(String[] args){
        A obj = new A(){
            void display(){
                System.out.print("HI");
            }
        };
        obj.display();
    }
}
