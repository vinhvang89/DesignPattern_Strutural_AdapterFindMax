import com.codegym.CollectionUtils;

import java.util.*;

public class CollectionOperatorAdapter implements CollectionOperations {
    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        assert false;
        list.addAll(0,numbers);
        CollectionUtils collectionUtils = new CollectionUtils();
        return  collectionUtils.findMax(list);
    }
}
