package labs.Udemy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Car {
    int price;
    String name;
    String brand;

    Car(int p, String n, String b){
        this.price =p;
        this.name =n;
        this.brand = b;
    }

    public static void main(String[] args) {
        Car c1  = new Car(2,"OUR Car","BMW");
        Car c2  = new Car(2,"OUR Car","BMW");
        Car c3  = new Car(2,"OUR Car","BMW");

        ArrayList<Car> c = new ArrayList<Car>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        for (int i = 0; i <c.size() ; i++) {
            System.out.println(c.get(i).brand+" "+c.get(i).name+" "+c.get(i).price);
        }
        for (Car m:c  ) {
            System.out.println(m.brand+" "+m.name+" "+m.price);

        }

        System.out.println("LinkedList");
        LinkedList<Car> c1a = new LinkedList<Car>();
        c1a.add(c1);
        c1a.add(c2);
        c1a.add(c3);
        for (Car m:c1a ) {
            System.out.println(m.brand+" "+m.name+" "+m.price);

        }
    }
}
