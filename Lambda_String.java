public class Lambda_String {
    public static void main(String[] args){
        // String str = "Anil";
        // if(str.isEmpty()){
        //     System.out.println("empty String ");  
        // }
        // else
        // System.out.println("Not an Empty String");
        A obj =  str->{
                if(str.isEmpty()){
                    return ("Empty String");
                }
                else
                return ("not an Empty String ");
            
        };
        System.out.println(obj.show("jogjb=g7"));
    }
}

interface A{
    public abstract String show(String str);
}