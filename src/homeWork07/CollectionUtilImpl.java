package homeWork07;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.*;

/**
 * Created by Персикс on 12.03.2015.g
 */
public class CollectionUtilImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> coll1, Collection<Integer> coll2) throws NullPointerException {
        if(coll1== null||coll2==null) throw new NullPointerException("NullPointerException:"+
                                                         "collection one or two is null");
       Collection<Integer> union =new ArrayList<Integer>();

        union.addAll(coll1);
        union.addAll(coll2);
        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        if(collection==null|| collection1==null)throw new NullPointerException("NullPointerException:"+
                "collection one or two is null");
        Collection<Integer> inter= new ArrayList<Integer>(collection);
        inter.retainAll(collection1);
        return inter;
    }

    @Override
    //объеденяем колекции без дублекатов
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> coll1, Collection<Integer> coll2) throws NullPointerException {
       if(coll1==null|| coll2==null)throw new NullPointerException("NullPointerException:"+
                                                             "collection one or two is null");

        Set<Integer>unionWith= new HashSet<Integer>();
        unionWith.addAll(coll1);
        unionWith.addAll(coll2);

        return unionWith;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        Set<Integer> union= new TreeSet<Integer>(collection);
        union.retainAll(collection1);

        return union;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {
        if(collection==null|| collection1==null)throw new NullPointerException("NullPointerException:"+
                "collection one or two is null");
        Collection<Integer> unionDiff= new ArrayList<Integer>(collection);
        unionDiff.removeAll(collection1);

        return unionDiff;

    }
}




