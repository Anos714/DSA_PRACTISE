package JCF.Module2;

/*

 */


import java.util.*;

public class DSSet {
    static void main() {

        Set<Integer> st=new HashSet<>();
        Set<Integer> st1=new HashSet<>();


        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        st.add(40);

        System.out.println(st);


        st1.add(10);
        st1.add(80);
        st1.add(80);
        st1.add(90);
        st1.add(20);

        System.out.println(st1);


        // iterator
        Iterator<Integer> it=st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    //     retainAll() method -> it gives the intersection of both sets
        st.retainAll(st1);
        System.out.println("Retain Set: "+st);

    //     containsAll() methods -> checks that set1 contains all elements of set2
        System.out.println(st.containsAll(st1));



    //    LinkedHashSet -> it is same as HashSet but also preserve orders
        Set<Integer>lst=new LinkedHashSet<>();
        lst.add(10);
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(12);
        lst.add(35);

        System.out.println(lst);

        // TreeSet -> same as HashSet but also sort the set

        Set<Integer>tst=new TreeSet<>();
        tst.add(10);
        tst.add(10);
        tst.add(20);
        tst.add(30);
        tst.add(12);
        tst.add(35);

        System.out.println(tst);


    //     HashSet         -> O(1)
    //     LinkedHashSet   -> O(n)
    //     TreeSet         -> O(log n)
    }
}
