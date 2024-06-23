import java.util.*;
public class char_datatype {
    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
       char ch;
       System.out.print("Enter Character:");
       ch=obj.next().charAt(2);
       System.out.print("character : "+ch);
       obj.close();
    } 
}
