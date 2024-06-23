public class inheritance{
    public static void main(String[] args){
        advCalc obj=new advCalc();
       int x= obj.add(5,6);
       int y= obj.sub(5,2);
       int p=obj.mul(2,3);
       int q=obj.div(10,5);
       System.out.println(x);
       System.out.println(y);
       System.out.println(p);
       System.out.println(q);
    }
}
class calc{
    int add(int n1,int n2){
    return n1+n2;
    }
    int sub(int n1,int n2){
        return n1-n2;
    }
}
class advCalc extends calc{
    int mul(int n1,int n2)
    {
       return n1*n2;
    }
      int div(int n1,int n2)
    {
       return n1/n2;
    }
}