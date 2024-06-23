class person {
    private String name;
    private int age;
    public person(){
        age=20;
        name="Tyson";
    }
    void setName(String name){
        this.name=name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}

public class default_constructor {
    public static void main(String[] args){
        person p=new person();
         System.out.println(p.getName()+" : "+p.getAge());
        // int age=20;
        // String name="Anil";
        // p.setName(name);
        // p.setAge(age);

    }
}
