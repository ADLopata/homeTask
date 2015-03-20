package homeWork07;

import com.sourceit.hometask.collections.MultiValueMap;
import sun.awt.SunHints;

import java.security.Key;
import java.util.*;

/**
 * Created by Персикс on 16.03.2015.
 */
public class MultiValMapImpl<K,V>  implements MultiValueMap <K,List<V>>,Map<K,List<V>>{

    private Map<K ,List<V>> mapValue= new HashMap<>();

    @Override
    public int getCountValues(K k) {
        List<V> counV= new ArrayList<>(mapValue.get(k));
        return counV.size();
    }

    @Override
    public Iterator<List<V>> getIterator(K k) {
        List<V> lv= mapValue.get(k);
        Iterator iter = lv.iterator();
      /*  mapValue.get(k);
       Iterator iter= mapValue.entrySet().iterator();

        return iter;*/
        return iter;
    }

    @Override
    public int size() {
        if(mapValue==null) {
            return 0;
        }return mapValue.size();
    }

    @Override
    public boolean isEmpty() {

        return mapValue.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return mapValue.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return mapValue.containsValue(value);
    }

    @Override
    public List<V> get(Object key) {

        return mapValue.get(key);
    }

    @Override
    public List<V> put(K key, List<V> value) {
        return mapValue.put(key,value);
    }

    @Override
    public List<V> remove(Object key) {
        return mapValue.remove(key);
    }

    @Override
    public void putAll(Map<? extends K, ? extends List<V>> m) {
     mapValue.putAll(m);
    }

    @Override
    public void clear() {
    mapValue.clear();
    }

    @Override
    public Set<K> keySet() {

        return mapValue.keySet();
    }

    @Override
    public Collection<List<V>> values() {

        return mapValue.values();
    }

    @Override
    public Set<Entry<K, List<V>>> entrySet() {
        return mapValue.entrySet();
    }

    @Override
    public boolean equals(Object o) {
        return mapValue.equals(o);
    }

    @Override
    public int hashCode() {
        return mapValue.hashCode();
    }

}
