public class throw_ex{
    public static void main(String[] args){
        int i=10,j=20,k=0;
        try{
             k=i/j;
             if(k == 0)
             throw new ArithmeticException("Not generating respond..");
        }
       catch(ArithmeticException e){
        System.out.println("Defualt value "+e);
        k=i/1;
       }
        System.out.println("result : "+k);
        System.out.println("Bye");
    }
}