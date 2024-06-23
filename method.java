class hi{
    public void hello(){
        System.out.println("hello world!!");
    }
    public String main(){
        return "Bye";
    }
    public void function(int num){
        System.out.println(num);
    }
}
class method{
public static void main(String[] args){
    int n=10;
      hi obj=new hi();
      obj.hello();
      String s=obj.main();
      obj.function(n);
      System.out.println(s);
   }
}