public class Exception_ex{
    public static void main(String[] args){
        int i,j,k=0;
        i=10;
        j=0;
        try
        {
           k=i/j;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Something went wrong..");
        }
        System.out.println("result : "+k);
        System.out.println("Bye");
    }
}