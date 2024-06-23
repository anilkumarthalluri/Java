public class Area_inheritance {
    public static void main(String[] args){
        rectangle sc= new rectangle();
        sc.area();
    }
}
class shape{
    int getArea(){
        return 0;
    }
}
class rectangle extends shape{
    void area(){
        int l=2,b=5;
        System.out.println("Area : "+(l*b));
    }
}