//import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
//import java.util.Date;

public class Test_File{
    public static void main(String[] args) throws IOException{
        File obj = new File("C:\\TestFiles\\Resume.txt"); //fffwe can use backward slash '/'
        //Date date = new Date(obj.lastModified());
        // if(obj.exists()){
        //     obj.delete();
        //     obj.createNewFile();
        //     System.out.println("File created successfully");
        // }
        // if(obj.isHidden()){     //To check File is Hidden or not
        //     System.out.println("File is Hidden");
        // }
        // else
        // System.out.println("File is open mode");
    //     System.out.println(obj.canWrite());
    //     obj.setWritable(false);
    //     System.out.println(obj.canWrite());
    // 
    // if(obj.isFile()){
    //     System.out.println("Given path is File");
    // }
    // else if(obj.isDirectory()){
    //     System.out.println("Given path is Directory");
    // }
    // System.out.println(date);
    System.out.println("File length : "+obj.length());
    //obj.write("java tutorial");
   }
}