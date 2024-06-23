import java.util.*;
class reverse{
    public int reverse_number(int num){
        int sum=0;
        int rem;
        while(num!=0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        return sum;
    }  
}
class reverse_number{
    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
       reverse sc=new reverse();
       int n;
       System.out.print("Enter number:");
       n=obj.nextInt();
       System.out.println("number:"+n);
       int x=sc.reverse_number(n);
        if(n==x)
        System.out.println(x+" "+"is palindrome");
        else
       System.out.println(x+" "+"is not a palindrome");

       obj.close();
    }
}