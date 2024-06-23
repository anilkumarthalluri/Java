public class final_keyword {
    public static void main(String[] args) {
        hello obj = new hello();
        final int a = 9;
        System.out.println(a);
        obj.show();
    }
}
final class hello{
    void show(){
        System.out.println("In show method");
    }
}
class hi {
    void xyz(){
    System.out.println("in xyz method");
    }
}