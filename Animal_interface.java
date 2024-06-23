interface Animal {
    public void Cat();

    public void Dog();
}
class wide implements Animal {
    public void Cat() {
        System.out.println("Cat makes sound MEOW");
    }

    public void Dog() {
        System.out.println("Dog makes sound \" Bow Bow \"");
    }
}

public class Animal_interface {
    public static void main(String[] args) {
        wide obj = new wide();
        obj.Cat();
        obj.Dog();
    }
}
