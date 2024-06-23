import java.io.File;
import java.io.IOException;

public class Create_Folder {
     public static void main(String[] args)throws IOException{
        File obj = new File("C:/Java_Files/program files/Data");
        obj.mkdirs();
        if(obj.exists())
        {
            System.out.println("Folder created Successfully");
        }
        else
        System.out.println("Can't create this Folder");
        // obj.delete();
        // if(obj.exists()){
        //     System.out.println("folder is exits");
        // }
        // else
        // System.out.println("Folder is deleted");
     }   
}