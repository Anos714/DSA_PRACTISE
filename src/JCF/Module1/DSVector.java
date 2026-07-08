package JCF.Module1;

/*
3. Vector -> Vector is synchronized so one operation can perform at a time whereas ArrayList is Async in nature

-- creation of Vector:-
Vector<Integer> v=new Vector<>();

all methods of ArrayList can be work here
 */

import java.util.Vector;

public class DSVector {
    static void main() {
        Vector<Integer>v=new Vector<>();
        v.add(12);
        v.add(13);
        v.add(14);
        v.add(15);
        v.add(16);
        v.add(17);

        System.out.println(v);

        v.set(2,51);
        System.out.println(v);

        System.out.println(v.size());

        Object[] obj=v.toArray();
        for(Object o:obj){
            System.out.println("Element: "+o);
        }

        String s=v.toString();
        System.out.println(s);
        System.out.println(s.charAt(7));

        System.out.println(v.contains(21));

    }
}
