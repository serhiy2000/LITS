//package CarWash;
//
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//
//public class CarWash {
//
//    private String vehicle;
//    private String service;
//    private int price;
//    private int quantity;
//
//
//    public void addBasket (){
//        Basket item = new Basket("Jeep", "bodywash");
//        LinkedHashSet<CarWash.Basket> basket;
//        LinkedHashSet <Basket> localBasket = basket;
//
//        if (localBasket.add(item)==true){
//            quantity = 1;
//            vehicle = item.getVehicle();
//            service = item.getService();
//            price = item.getPrice();
//            Basket checkoutItem = new Basket(vehicle, service, price, quantity);
//            System.out.println(checkoutItem+"checkoutItem");
//
//        }
//
//
//    public static void main(String[] args) {
//        LinkedHashSet<Basket> basket = new LinkedHashSet<>();
//        ArrayList<Basket> checkout = new ArrayList<>();
//        CarWash basketItem = new CarWash();
//
//        basket.addBasket (service);
//
//        //addCommand
//
//
//
//
//    }
//}
