import java.io.IOException;
import java.io.File;

public class Print_Files {
    public static void main(String [] args)throws IOException{
        File obj = new File("C:\\");
       // System.out.println(Arrays.toString(obj.list()));
       for(String file : obj.list()){
        System.out.println(file);
       }
    }   
}