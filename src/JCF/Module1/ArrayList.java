package JCF.Module1;

/*
it is a tool that provides interface of the data structures like stack, queue, set, list, linkedlist etc. and we can use them without writing our own code for different data structures
*/

/*
1. List Interface - 4 types
- ArrayList
- LinkedList
- Stack
- Vector

-- List Specific Method:-
- add() :- Collection me ek naya element/data insert ya jodta hai.

- addAll() :- Ek sath poori doosri collection ke saare elements ko jodta hai.

- get() :- Kisi specific index (position) par maujood element ko nikal kar dikhata hai.

- iterator() :- Collection ke saare elements par ek-ek karke aage badhne (traverse karne) ke liye loop object deta hai.

- set() :- Kisi specific index par pehle se maujood element ko naye element se replace (badal) deta hai.

- remove() :- Collection se kisi specific element ya kisi index wale data ko delete karta hai.

- removeAll() :- Doosri collection me diye gaye saare elements ko current collection se ek sath delete karta hai.

-clear() :- Collection ke saare elements ko ek sath delete karke use bilkul khali (empty) kar deta hai.

- size() :- Collection me total kitne elements maujood hain, unki counting (ginti) batata hai.

- toArray() :- Java Collection ko ek normal Array (jaise Object[] ya T[]) me convert kar deta hai.

- contains() :- Check karta hai ki koi specific element collection me maujood hai ya nahi (true/false return karta hai).

- sort(): Yeh method kisi array ya collection ke elements ko ascending (chote se bade) order me arrange karta hai.

- clone(): Yeh method kisi existing object ki exact copy (shaloow copy) banane ke kaam aata hai.

- ensureCapacity(): Yeh ArrayList ka size automatic badhne se pehle hi uski minimum capacity manually fixed kar deta hai.

- isEmpty(): Yeh check karta hai ki koi list, string, ya collection khali hai ya nahi (true ya false return karta hai).

- indexOf(): Yeh kisi element ko search karke list ya string me uski sabse pehli position (index number) batata hai.

-- Implementation:- al 3 are valid
    ArrayList<Integer> arr=new ArrayList<>();
    List<Integer> arr1=new ArrayList<>();
    Collection<Integer> arr2=new ArrayList<>();


 */

import java.util.Comparator;
import java.util.Iterator;


public class ArrayList {

    public static void main(String[] args){
        // ArrayList:-
        java.util.ArrayList<Integer> arr=new java.util.ArrayList<>();

        // add() method
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr);

        //remove() method
        arr.remove(2);
        System.out.println(arr);

    //     addAll() method
        java.util.ArrayList<Integer> arr1=new java.util.ArrayList<>();
        arr1.add(101);
        arr1.add(201);
        arr1.add(301);

        arr.addAll(arr1);
        System.out.println(arr1);
        System.out.println(arr);

    //     removeAll() method
        arr.removeAll(arr1);
        System.out.println(arr);

    //     get() method
        int var1=arr.get(2);
        System.out.println(var1);

    //     set() method
        arr.set(0,1000);
        System.out.println(arr);

    //     size() method
        int arrLen=arr.size();
        System.out.println(arrLen);

    //     contains() method
        boolean isElementPresent=arr.contains(30);
        System.out.println(isElementPresent); //false

        boolean isElementPresent1=arr.contains(40);
        System.out.println(isElementPresent1); //true

    //     iterator() method
        Iterator<Integer> iterator=arr.iterator();
       while(iterator.hasNext()){
           System.out.println("Element: "+iterator.next());
       }

    //     clear() method
        System.out.println("arr1 elements: "+arr1);
        arr1.clear();
        System.out.println(arr1); //[]

    //     toArray() method
        Object[] arr2=arr.toArray();
        for(Object obj:arr2){
            System.out.println("Element: "+obj);
        }

    // sort() method
        java.util.ArrayList<String> strList=new java.util.ArrayList<>();
        strList.add("mango");
        strList.add("orange");
        strList.add("guava");
        strList.add("apple");
        strList.add("banana");
        System.out.println(strList);

        // integer sorting
        arr.sort(Comparator.naturalOrder());//ascending order
        arr.sort(Comparator.reverseOrder()); //descending order
        System.out.println(arr);

    //     string sorting
    //     ascending order
        strList.sort(Comparator.naturalOrder());
        System.out.println("Ascending Order: "+strList);

    //     descending order
        strList.sort(Comparator.reverseOrder());
        System.out.println("descending Order: "+strList);


    //  clone() method
        java.util.ArrayList<Integer> arrList=(java.util.ArrayList<Integer>) arr.clone();

        System.out.println(arrList);


    //     ensureCapacity() method
        strList.ensureCapacity(10);
        System.out.println(strList);

    //     isEmpty() method
        System.out.println(strList.isEmpty());//false
        System.out.println(arr1.isEmpty());//true

    //     indexOf() method
        System.out.println(strList.indexOf("guava"));//2


    }

}
