package lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunsctionalProgramming {
    public static void main(String[] args) {

        Function <String, Integer> f = x -> 1;
        System.out.println(f.apply("fert"));

        BiFunction <Integer, Integer, Integer> bif = (x,y) -> x+y;

        Predicate <String> pr = fss -> fss.length() >1;

        Predicate <Integer> odd = x -> x%2==1;
        System.out.println("odd="+odd.test(3));

        UnaryOperator <String> unaryOperator = uo -> uo + "uo";
        System.out.println(unaryOperator.apply("Serhiy"));

        Supplier <Integer> supplier = () -> {int a =2, b = 4; return a+b;};
        System.out.println(supplier.get());

        String string = "hi";

        Consumer <String> consumer = t -> t = "now it's hello";

        consumer.accept(string);
        System.out.println(string);

        List <Integer> integers = Arrays.asList(9,3,3,21,5,6,7,8,9,10);
        integers.stream().
                filter(integ -> integ%3 ==0)

                .sorted()
                .distinct()
                .forEach(integ -> System.out.println(integ));


    }

    public int bif () {
        int x =3, y =4, z;
        z = x + y;
        return x+y;




    }
}
