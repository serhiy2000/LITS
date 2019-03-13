package lesson6extends;

public class Animals { // it works !!!



    String name;
    String type;
    int age;


    public static void main(String[] args) {


        Cat mur = new Cat("Murchik", 5);
        System.out.println("Animals.java: Cat's name is:"+mur.name+". Murchik's age is: "+mur.age); // ???? не визиває поле мурчика

    }

}
