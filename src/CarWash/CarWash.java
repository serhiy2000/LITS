//import java.util.*;
//
//
//public class Serhija {
//
//
//    public static class Car {
//
//        private String model;
//        private int age;
//        private String color;
//
//        public Car(String model, int age, String color) {
//            this.model = model;
//            this.age = age;
//            this.color = color;
//        }
//
//        public String getModel() {
//            return model;
//        }
//
//        public void setModel(String model) {
//            this.model = model;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age = age;
//        }
//
//        public String getColor() {
//            return color;
//        }
//
//        public void setColor(String color) {
//            this.color = color;
//        }
//
//        @Override
//        public String toString() {
//            return "Car{" +
//                    "model='" + model + '\'' +
//                    '}';
//        }
//
//        public static void main(String[] args) {
//
//            Car car1 = new Car ("Opel", 2, "red");
//            Car car2 = new Car ("Toyota", 3, "black");
//            Car car3 = new Car ("Mazda", 3, "green");
//            Car car4 = new Car ("Nissan", 23, "white");
//
//
//            ArrayList<Car> single = new ArrayList();
//            single.add(car1);
//            System.out.println(single.get(0).model);
//
//
//            LinkedHashSet<Car> triple = new LinkedHashSet<>();  // чудова заготовка на кошик у нашій аппці
//
//            triple.add(car1);
//            triple.add(car1);
//            triple.add(car3);
//
//
//            System.out.println(triple);     // тут використовує одверайднутий метод toString
//
//            for (Car model : triple)
//                System.out.println(model.model);   // це кльово працює.
//
//
//            // to upload to GITHUB - it is necessary to Commit and Push.
//            // - VCS/Commit (or CTRL+K)
//            // - VCS/GIT/Push (or CTRL+SHIFT+K)
//
//            // to download to IDEA - VCS/Update Project (or CTRL+T)
//
//        }
//
//// в один момент в одному гаражі може бути одна машина, в іншому може бути три машини
//
//    }
//}
//
////package CarWash;
////
////import java.util.ArrayList;
////import java.util.LinkedHashSet;
////
////public class CarWash {
////
////    private String vehicle;
////    private String service;
////    private int price;
////    private int quantity;
////
////
////    public void addBasket (){
////        Basket item = new Basket("Jeep", "bodywash");
////        LinkedHashSet<CarWash.Basket> basket;
////        LinkedHashSet <Basket> localBasket = basket;
////
////        if (localBasket.add(item)==true){
////            quantity = 1;
////            vehicle = item.getVehicle();
////            service = item.getService();
////            price = item.getPrice();
////            Basket checkoutItem = new Basket(vehicle, service, price, quantity);
////            System.out.println(checkoutItem+"checkoutItem");
////
////        }
////
////
////    public static void main(String[] args) {
////        LinkedHashSet<Basket> basket = new LinkedHashSet<>();
////        ArrayList<Basket> checkout = new ArrayList<>();
////        CarWash basketItem = new CarWash();
////
////        basket.addBasket (service);
////
////        //addCommand
////
////
////
////
////    }
////}
