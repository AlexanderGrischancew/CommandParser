import java.util.TreeMap;

/**
 * This extended TreeMap is capable of interpreting its key as a
 * regular-expression and therefore matches the given value to the stored key as
 * regex.
 *
 * @author Alexander Grischancew
 *
 * @param <K>
 *            Key as specified in TreeMap.
 * @param <V>
 *            value as specified in TreeMap.
 */
public class RegexTreeMap<K, V> extends TreeMap<K, V> {

    @Override
    public V get(Object key) {
        for (Object superKey : super.keySet()) {
            if (key.toString().matches(superKey.toString())) {
                return super.get(superKey);
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) != null;
    }

}