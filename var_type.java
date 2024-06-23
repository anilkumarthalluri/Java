public class var_type {
   // var c; Not for Instance class 
    public static void main(String[] args) {
        int n = 10;
        var a= 9;    //  only for local variable
       // var b; Error
        System.out.println("n : "+n);
        System.out.println("a : "+a);
        var A = new int[10];
        System.out.println(A);
    }

}