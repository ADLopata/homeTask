package homeWork07;

import com.sourceit.hometask.collections.ListUtils;

import java.util.*;

/**
 * Created by Персикс on 12.03.2015.
 */
public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... arg) throws IllegalArgumentException {
       if(arg==null)throw new IllegalArgumentException("IllegalArgumentException:"+
                                    "one of the set arguments is null");

        List<String> addArs= new ArrayList<String>(arg.length);
          for (String item: arg){
              addArs.add(item);
          }
      /*  Iterator iterator = repres.iterator();
        while (iterator.hasNext()) {
            String arg =(String)iterator.next();
        }*/

        return addArs;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> list) throws IllegalArgumentException {
       if(list==null) throw new IllegalArgumentException("IllegalArgumentException:"+
                                               "one of the set arguments is null");

        List<T> sortList= new ArrayList<T>();
        sortList.addAll(list);
        Comparator<T> compLisi= Collections.reverseOrder();
        Collections.sort(sortList,compLisi);




        return sortList;
    }
}
