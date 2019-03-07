package lesson12HashSetTreeSetLinkedSet;

import java.util.*;

public class Car {

    private String model;
    private int age;
    private String color;

    public Car(String model, int age, String color) {
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
    single.add(car1);
    System.out.println(single.get(0).model);


    LinkedHashSet<Car> triple = new LinkedHashSet<>();  // чудова заготовка на кошик у нашій аппці

    triple.add(car1);
    triple.add(car1);
    triple.add(car3);


    System.out.println(triple);     // тут використовує одверайднутий метод toString

    for (Car model : triple)
        System.out.println(model.model);   // це кльово працює.



    }

// в один момент в одному гаражі може бути одна машина, в іншому може бути три машини

}
