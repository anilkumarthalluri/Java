public class try_catch {
    public static void main(String[] args){
        int i=10;
        try{
             if(i!=1)
        throw new ArithmeticException("Number not matched");
        }
       catch(ArithmeticException e){
        System.out.println("Can't add number "+e);
       }
    }
}
