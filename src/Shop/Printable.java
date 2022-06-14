package Shop;

import java.util.Map;

public interface Printable {

    default void print(Map<Integer, Good> goods){
        goods.entrySet().forEach(entry -> {
            System.out.println(entry.getValue());
        });
    }
}
