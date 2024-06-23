public class Lambda_Sum {
     public static void main(String []args)   {
         A obj = (i,j)-> i+j;
         int x = obj.show(5,5);
         System.out.println(x);
     }
}

interface A{
    public abstract int show(int i,int j);
}