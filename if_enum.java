enum Status{
    pending, Running, Success;
}

public class if_enum {
    public static void main(String[] args){
       Status s = Status.Success;
       if(s == Status.pending)
       {
        System.out.println("Please wait..");
       }
       else if(s == Status.Success)
       {
        System.out.println("Done");
       }
       else
       System.out.println("All good");
    }
}