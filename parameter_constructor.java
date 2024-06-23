class person {
    private int age;
    private String name;
    public person(int age,String name){
       this.age=age;
       this.name=name;
    }
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class parameter_constructor {
    public static void main(String[] args) {
        person p = new person(20,"Anil");
        System.out.print(p.getName()+ " : " + p.getAge());
    }
}