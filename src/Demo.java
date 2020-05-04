import com.codegym.CollectionUtils;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(44);
        set.add(18);
        set.add(21);
        set.add(42);
        set.add(94);
        set.add(122);
        CollectionOperations collectionOperations = new CollectionOperatorAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(set);
    }
}
