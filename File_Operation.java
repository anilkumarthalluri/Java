import java.io.FileWriter;
import java.io.IOException;

public class File_Operation{
    public static void main(String[] args)throws IOException{
        FileWriter obj = new FileWriter("C:\\TestFiles\\Resume.txt");
    //     System.out.println("File created : "+obj.createNewFile());
    //     System.out.println("write : "+obj.canWrite());
    //     System.out.println(obj.delete());
    //     System.out.println("File Exists : "+obj.exists());
    //     System.out.println("File Name : "+obj.getName());
    //     System.out.println("File path : "+obj.getAbsolutePath());
    //     System.out.println("File length : "+obj.length());
    //     obj.mkdir();
      obj.write("Java tutorial , Easy to maintain");
      obj.close();

    }
}