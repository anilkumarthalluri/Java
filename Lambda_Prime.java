public class Lambda_Prime {
    public static void main(String[] args){
        A obj = x->{
                int count = 0;
                for(int i=1;i<=x;i++){
                    if(x%i==0){
                        count++;
                    }
                }
                return count;
            
        };
        int x = obj.PrimeNumber(2);
        if(x==2)
        System.out.println("PrimeNumber");
        else
        System.out.println("NotPrimeNumber");
    }   
}

interface A{
    public abstract int PrimeNumber(int n);
}