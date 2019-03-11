package lesson12HashSetTreeSetLinkedSet;

import java.sql.SQLOutput;
import java.util.*;

public class Car {

    public String model;
    public int age;
    public String color;

    public Car(String model, int age, String color) {
        this.model = model;
        this.age = age;
        this.color = color;
    }

    public Car(String model, int age, int price) {
        this.model = model;
        this.age = age;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {

    Car car1 = new Car ("Opel", 2, "red");
    Car car2 = new Car ("Toyota", 3, "black");
    Car car3 = new Car ("Mazda", 3, "green");
    Car car4 = new Car ("Nissan", 23, "white");


    ArrayList<Car> single = new ArrayList();
    single.add(car2);
    System.out.println(single.get(0).model);


    LinkedHashSet<Car> triple = new LinkedHashSet<>();  // чудова заготовка на кошик у нашій аппці

        triple.add(car1);
        System.out.println(triple.add(car1));
        triple.add(car3);


    Iterator <Car> iterator = triple.iterator();
    while (iterator.hasNext()){
        Car aCar = iterator.next();
        System.out.println("Message from Iterator"+aCar);
        System.out.println("iterator.hasNext" + iterator.hasNext());
    }

    System.out.println(triple);     // тут використовує одверайднутий метод toString

    for (Car model : triple)
        System.out.println(model.model);   // це кльово працює.

        ArrayList <Car> basket = new ArrayList<>();

        if (triple.add(car4) == true){
            System.out.println("Added element to the triple carwash"+car4);
            int q=1;

            Car busket = new Car(car4.getModel(), q , 125);
            System.out.println("basket"+busket);
        };




        // to upload to GITHUB - it is necessary to Commit and Push in two steps.
        // 1. VCS/Commit (or CTRL+K)
        // 2. VCS/GIT/Push (or CTRL+SHIFT+K)

        // to download to IDEA - VCS/Update Project (or CTRL+T)

    }

// в один момент в одному гаражі може бути одна машина, в іншому може бути три машини
//    Test fom DimOnChik . Перевіряю роботу з ГітХабом.

}
