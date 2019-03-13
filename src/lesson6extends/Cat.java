package lesson6extends;

public class Cat extends Animals{


    public Cat (String name, int age)    {
        this.name = name;
        this.age = age;
    }

    public Cat (String type, String name, int age)    {
        this.type = type;
        this.name = name;
        this.age = age;
    }

//    public static void main(String[] args) {
//        Cat mur = new Cat ("cat", "Murchik", 5);
//        Cat mur2= new Cat ("Mau", 12);
//        System.out.println("Cat.java : Cat's name is:"+mur.name+". Murchik's age is: "+mur.age); // ???? не визиває поле мурчика
//        System.out.println("Cat.java : Cat's name is:"+mur2.name+". Murchik's age is: "+mur2.age); // ???? не визиває поле мурчика
//
//    }
//


}
