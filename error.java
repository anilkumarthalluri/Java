public class error{
    public static void main(String[] args){
        int i=10,j=2,k=0;
        int A[] = new int[5];
        String name="";
        try{
        k=i/j;
        System.out.println(A[2]);
        System.out.println(A[7]);
         name.length();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array problem");
        }
        catch(ArithmeticException obj){
            System.out.println("Something went wrong..");
        }
        System.out.println("result : "+k);
    }
}