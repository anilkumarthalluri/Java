public class Custom_Exception{
    public static void main(String[] args){
        int i=10,j=20,k=0;
        try{
             k=i/j;
             if(k == 0)
             throw new AnilException("Can't print Zero");
        }
       catch(AnilException e){
        System.out.println("Defualt value ");
        k=i/1;
       }
        System.out.println("result : "+k);
    }
}
class AnilException extends ArithmeticException{
    public AnilException(String str){
        super(str);
    }
}