import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    public final Map<String, Long> phoneBookMap = new TreeMap<>();

    public int add(String name, Long number) {
        phoneBookMap.put(name, number);
        return phoneBookMap.size();
    }

}
