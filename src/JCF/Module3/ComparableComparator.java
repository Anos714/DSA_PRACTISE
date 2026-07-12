package JCF.Module3;


import java.util.*;

public class ComparableComparator {
    static void main() {
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(15);
        // list.add(7);
        // list.add(22);
        // list.add(35);
        // list.add(76);
        //
        // System.out.println(list);
        //
        // Collections.sort(list);
        // list.sort(Comparator.naturalOrder());
        //
        // System.out.println(list);


        // List<Student> st = new ArrayList<>();
        // Student s1 = new Student(21, "Rahul", 62.800);
        // Student s2 = new Student(21, "Rajesh", 65);
        // Student s3 = new Student(20, "Hemant", 63.500);
        // Student s4 = new Student(22, "Kalu", 67);
        // Student s5 = new Student(18, "Bhanu", 72.800);
        //
        // st.add(s1);
        // st.add(s2);
        // st.add(s3);
        // st.add(s4);
        // st.add(s5);
        //
        // System.out.println(st);

// Collections.sort(st, new Comparator<Student>() {
//     @Override
//     public int compare(Student o1, Student o2) {
//         return Double.compare(o1.weight,o2.weight);
//     }
// });

        // Collections.sort(st,new WeightComapartor());

        // System.out.println(st);
        //
        //
        // Collections.sort(st, (o1, o2) ->  Double.compare(o1.weight,o2.weight) );


        Integer [] arr={1,4,2,5,2,3,1};
        Arrays.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer i,Integer j){
                return -Integer.compare(i,j);

            }
        });
        for(Integer a: arr){
            System.out.print(a);
        }

    }

}
