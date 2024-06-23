import java.util.*;  
public class index_String{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name;
    char ch;
    int n;
    System.out.print("Enter string:");
    name=sc.nextLine();
    System.out.print("Enter index to identify character:");
    n=sc.nextInt();
    ch=name.charAt(n);
    System.out.println("String:"+name);
    System.out.println("character at "+n+" is "+ch);
    sc.close();
   }   
}