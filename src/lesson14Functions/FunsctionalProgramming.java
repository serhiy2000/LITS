package lesson14Functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunsctionalProgramming {
    public static void main(String[] args) {

        Function <String, Integer> f = x -> 1;
        System.out.println("function: "+f.apply("fert"));

        BiFunction <Integer, Integer, Integer> bif = (x,y) -> x+y;
        System.out.println(("bifunction: "+bif.apply(1,2)));

        Predicate <String> pr = fss -> fss.length() >1;
        System.out.println("predicate string: "+pr.test("serh"));

        Predicate <Integer> odd = x -> x%2==1;
        System.out.println("predicate int odd="+odd.test(3));

        String uoo = "Serhiy";
        UnaryOperator <String> unaryOperator = uo -> uo + "uo";
        System.out.println("Unary operator. should be here Serhiyuo:"+unaryOperator.apply(uoo));

        Supplier <Integer> supplier = () -> {int a =2, b = 4; return a+b;};
        System.out.println("supplier: "+supplier.get());

        String string = "hi";

        Consumer <String> consumer = t -> t = "now it's hello";

        consumer.accept(string);
        System.out.println("input = "+string+". consumer: ");


//        stream
        List <Integer> integers = Arrays.asList(9,3,3,21,5,6,7,8,9,10);
        integers.stream().
                filter(integ -> integ%3 ==0)

                .sorted()
                .distinct();
//                .forEach(integ -> System.out.println(integ));

        BiFunction<Integer, Integer, Integer> bif1 = (x, y) -> x+y;
        Function<BiFunction<Integer, Integer, Integer> , Integer> func2 = bif2->bif2.apply(1,2);

        System.out.println("func2="+func2.apply(bif1));


    }

    public int bif () {
        int x =3, y =4, z;
        z = x + y;
        return x+y;




    }
}
