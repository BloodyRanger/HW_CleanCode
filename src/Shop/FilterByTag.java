package Shop;

import java.util.Map;
import java.util.stream.Collectors;

public interface FilterByTag{

    default Map filter(Map<Integer, Good> wareHouse, String tag) {
        return wareHouse.entrySet().stream()
                .filter(x -> (x.getValue().getName().toLowerCase()
                        + x.getValue().getCategory().toLowerCase()
                        + x.getValue().getDescription()).toLowerCase()
                        .contains(tag))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}