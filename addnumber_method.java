import java.util.*;
class add{
    public int addnumber(int num){
        int sum=0;
        int rem;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }  
}
class addnumber_method{
    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
       add sc=new add();
       int n;
       System.out.print("Enter number:");
       n=obj.nextInt();
       System.out.println("number:"+n);
       int x=sc.addnumber(n);
       System.out.println("sum of individual number:"+x);
       obj.close();
    }
}