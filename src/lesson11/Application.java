package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List integers = Arrays .asList(1,2,3,4,5,6,"fdff","fff");
        List <?> list = new ArrayList<>(integers);

        for (Object o: list){

            if (o instanceof Integer){ // тут ми первіряємо на належність до певнгого типу
                System.out.println("o is integer:"+o);
            }
        }

        System.out.println(list);
    }

}
// List <? super OS> systems = new ArrayList<>(); - в цьомі лісті можуть бути обєкти створені в ОС і тих методів від яких ОС наслідується. клас і ВИЩЕ
// List <? extends OS> systems2 = new ArrayList<>(); - в цьому лісті  можуть бути обєксти створені в ОС і його нащадках . клас і НИЖЧЕ

