public class Duplicate_Exception {
    public static void main(String[] args){
        int n1=10,n2=10;
        if(n1==n2){
            throw new ArithmeticException("Duplicate numbers");
        }
        else
        System.out.println("Different numbers");
    }
}