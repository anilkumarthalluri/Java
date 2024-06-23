enum Status{
    pending, Running, Sucess
}
public class switch_enum {
   public static void main(String[] args){
      Status s= Status.pending;
      switch(s){
        case pending:
        System.out.println("Please wait..");
        break;
        case Running:
        System.out.println("All good");
        break;
        default:
        System.out.println("Done");
      }
   }   
}