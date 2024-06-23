import java.util.*;
class check{
    public void checkString(String name)throws ArithmeticException{
       int len,count=0;
       len=name.length();
       for(int i=0;i<len;i++){
        if(name.charAt(i)=='a'||name.charAt(i)=='A'||
        name.charAt(i)=='E'||name.charAt(i)=='e'||
        name.charAt(i)=='i'||name.charAt(i)=='I'||
        name.charAt(i)=='o'||name.charAt(i)=='U'||
        name.charAt(i)=='U'||name.charAt(i)=='u'){
            count++;
        }
       }
       if(count!=0){
         System.out.println("Vowels : "+count);
       }
       else{
        throw new ArithmeticException("vowels not found");
       }
    }
}
public class String_Vowel_Exception{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        check obj = new check();
        String name;
        System.out.print("Ente string : ");
        name = sc.nextLine();
        try{
             obj.checkString(name);
        }
       catch(ArithmeticException e){
        System.out.println("Error : "+e);
       }
       sc.close();
    }
}