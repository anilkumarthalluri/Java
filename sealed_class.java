sealed class A permits B,C,D{
    public void show(){
        System.out.println("In show A");
    }
}

final class B extends A {
    public void show(){
                System.out.println("In show B");

    }
}

non-sealed class C extends  A{
    public void show (){
                System.out.println("In show C");

    }
}

 class D {
    public void show(){
                System.out.println("In show D");

    }
}

public class sealed_class {
    public static void main(String[] args){
        D obj = new D();
        obj.show();
    }
}