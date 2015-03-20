package homeWork07;

import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

public class SetUtilsImpl implements SetUtils{
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection, Set<String> set) throws NullPointerException {
       ArrayList<String> s = new ArrayList<>();
        s.addAll(set);
       ArrayList<Integer> k= new ArrayList<>();
        k.addAll(collection);
       final Map<Integer,String> map= new TreeMap<>();
        for(int i= 0; i<map.size(); i++) {
            map.put(k.get(i), s.get(i));
             }
        SortedSet<String> ss= new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String  o1 , String o2) {

                return map.get(o1).compareTo(map.get(o2));
            }
        });ss.addAll(set);

        return ss;
    }

    @Override
    public Set<Integer> customOrderSet(Integer... arg) throws NullPointerException {
        if(arg== null)throw  new NullPointerException("one of the set arguments is null");
     Set<Integer> set =new HashSet<>();
        for (int i= 0;i<arg.length;i++) {
            set.add(arg[i]);
        }
        Set<Integer>set1= new TreeSet<>();
        set1.addAll(set);

        return set1;
    }
}
