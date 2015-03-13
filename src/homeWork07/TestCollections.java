package homeWork07;

import java.util.*;

/**
 * Created by Персикс on 12.03.2015.
 */
public class TestCollections {

    public static void main(String[] args) {
        CollectionUtilImpl cui = new CollectionUtilImpl();
        ListUtilsImpl lui= new ListUtilsImpl();

        Collection<Integer> a = new LinkedList<Integer>();
        a.add(2);
        a.add(1);
        a.add(6);
        a.add(6);

        Collection<Integer> s = new LinkedList<Integer>();
        s.add(6);
        s.add(8);
        s.add(4);

        System.out.println();
        System.out.print(cui.union(a, s));
        System.out.println();
        System.out.println(cui.unionWithoutDuplicates(a, s));
        System.out.println(cui.intersectionWithoutDuplicates(a, s));
        System.out.println(cui.intersection(a, s));
        System.out.println(cui.difference(a, s));

        System.out.println("Test of method by the add elements in the List:");
        String []d={"s","d","r"};
        System.out.println(lui.asList(d));

        System.out.println("Test of method by the sorted List:");

           List<String> linkT = new LinkedList<String>();
        try {// если лист пустой то он не выполняет блок catch

            linkT.add("1");
            linkT.add("6");
            linkT.add("5");
            System.out.println(lui.sortedList(linkT));
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
