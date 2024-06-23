
public class Lambda_Factorial{
    public static void main(String[] args){
      A obj =  x->{
             if(x==0)
             return 1;
             else{
                int result = 1;
                for(int i = 1 ; i<=x ; i++){
                     result = result*i;
                }
                return result;
             }
          
      };
       int x = obj.show(10);
       System.out.println(x);
    }
}

interface A{
    public abstract int show(int n);
}