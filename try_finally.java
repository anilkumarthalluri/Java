public class try_finally {
  public static void main(String[] args){
    int i=10,j=0,result=0;
    try{
      result = i/j;
    }
    catch(ArithmeticException e){
        System.out.println("Something went wrong");
    }
    finally{
        System.out.println("result : "+result);
    }
  }   
}