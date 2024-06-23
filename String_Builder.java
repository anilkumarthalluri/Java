public class String_Builder {
     public static void main(String[] args){
        StringBuilder obj1 = new StringBuilder("Hello");
        StringBuilder obj2 = new StringBuilder("Hello");
        StringBuilder obj3 = new StringBuilder("");
        System.out.println(obj1 == obj2);  //compares address
        System.out.println(obj2.compareTo(obj2));
        System.out.println("Defualt : "+obj3.capacity());
        obj1.ensureCapacity(100);
        System.out.println("set capacity : "+obj1.capacity());
        System.out.println(obj1.charAt(4));
        obj1.delete(1, 2);
        System.out.println(obj1);
        obj1.insert(1,"ee");
        System.out.println(obj1);
        obj1.delete(1,2);
        System.out.println(obj1);
        obj1.reverse();
        System.out.println(obj1);
        
     }   
}