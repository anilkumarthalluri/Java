public class Lambda_Upper_Lower{
    public static void main(String[] args){
       String name = "AnilKumAr";
       System.out.println("Name : "+name);
    //    System.out.println("UpperCase : "+name.toUpperCase());
    //    System.out.println("LowerCase : "+name.toLowerCase());
     A obj =  s->{
            System.out.println("UpperCase : "+s.toUpperCase());
            System.out.println("LowerCase : "+s.toLowerCase());
     };
     obj.show(name);
    }
}

interface A{
    public abstract void show(String s);
}