package Shop;

import java.util.Map;
import java.util.stream.Collectors;

public interface FilterByPrice {
    default Map filter(Map<Integer, Good> wareHouse, double min, double max) {
        return wareHouse.entrySet().stream()
                .filter(x -> (x.getValue().getPrice() >= min && x.getValue().getPrice() <= max))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
