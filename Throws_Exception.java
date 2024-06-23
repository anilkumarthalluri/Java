public class Throws_Exception{
    public static void main(String[] args){
       A obj = new A();
       try{
        obj.show();
        System.out.println("class is present");
       }
       catch(ClassNotFoundException e){
        System.out.println("class is not present");
       }
    }
}

class A{
   public void show()throws ClassNotFoundException {
      Class.forName("Throws_Exception");
   }
}