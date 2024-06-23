class Developer{
    void code(laptop lap){
      lap.code();
    }
}
class laptop{
    void code(){
        System.out.println("code, compile, run ");
    }
}
public class ex_interface{
    public static void main(String[] args){
        laptop lap = new laptop();
        Developer tyson = new Developer();
        tyson.code(lap);
    }
}