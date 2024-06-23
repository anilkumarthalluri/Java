enum Status{
    Running, Failed, Pending, Succes;
}
public class ex_enum {
    public static void main(String[] args){
        Status[] s =  Status.values();
        for(Status x : s){
        System.out.println(x+" : "+x.ordinal());
        }
    }
}