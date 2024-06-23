import java.util.*;

class Car {
    String name;
    int n;

    void setName(String name) {
        this.name = name;
    }

    void setNo(int n) {
        this.n = n;
    }

    String getName() {
        return name;
    }

    int getNo() {
        return n;
    }
}

public class car_encaps {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Car sc = new Car();
        String car_Name = "Rolls Royce";
        int Car_no = 1225;
        sc.setName(car_Name);
        sc.setNo(Car_no);
        System.out.println("Car name : "+sc.getName());
        System.out.println("Car No : "+sc.getNo());
        obj.close();
    }
}
