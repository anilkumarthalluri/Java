abstract class Animal {
    public abstract void eat();

    public abstract void sleep();
}

class Lion extends Animal {
    public void eat() {
        System.out.println("Lion eats deer");
    }

    public void sleep() {
        System.out.println("Lion sleeps efficiently");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Tiger eats Flesh");
    }

    public void sleep() {
        System.out.println("Tiger sleeps quickly");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer eats grass");
    }

    public void sleep() {
        System.out.println("Deer sleeps ");
    }
}

public class Animal_abstract {
    public static void main(String[] args) {
        Lion obj1 = new Lion();
        obj1.eat();
        obj1.sleep();
        System.out.println("-------------------");
        Tiger obj2 = new Tiger();
        obj2.eat();
        obj2.sleep();
        System.out.println("-------------------");
        Deer obj3  = new Deer();
        obj3.eat();
        obj3.sleep();
    }
}