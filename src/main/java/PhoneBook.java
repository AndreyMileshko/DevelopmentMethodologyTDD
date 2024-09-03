import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class PhoneBook {

    public final Map<String, Long> phoneBookMap = new TreeMap<>();

    public int add(String name, Long number) {
        phoneBookMap.put(name, number);
        return phoneBookMap.size();
    }

    public String findByNumber(Long number) {
        if (!phoneBookMap.containsValue(number)) {
            return null;
        }
        Optional<String> result = phoneBookMap.entrySet()
                .stream()
                .filter(entry -> number.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        return result.orElse(null);
    }
}
