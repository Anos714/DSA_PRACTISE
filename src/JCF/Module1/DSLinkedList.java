package JCF.Module1;

/*
2. LinkedList

-- Implementation:-
LinkedList<Integer> ll=new LinkedList<>();

-- LinkedList as Queue and Dequeue

all methods of ArrayList except ensureCapacity() and trimToSize() works also in LinkedList but there are several methods taht are exclusive for LinkedList also whoich are given below.

- addFirst(E e) / push(E e):- Adds an element directly to the absolute front of the list.

- addLast(E e):- Appends an element directly to the absolute end of the list.

- getFirst() / peek():- Retrieves (but does not remove) the first element.

- getLast():- Retrieves (but does not remove) the last element.

- removeFirst() / pop() / poll():- Removes and returns the first element from the list.

- removeLast():- Removes and returns the last element from the list.

- offer():- adds the specified element at the end of the linked list.

- descendingIterator():- Returns an iterator that goes backward (from tail to head).
 */

import java.util.Iterator;
import java.util.LinkedList;

public class DSLinkedList {
     static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();
        list.add(12);
         list.add(25);
         list.add(13);
         list.add(7);
         list.add(19);

         System.out.println("List Element: "+list);

    //     addFirst() method
         list.addFirst(41);
         System.out.println(list);

    //      addLast() method
         list.addLast(6);
         System.out.println(list);

    //      getFirst()/peek() method
         int val1=list.getFirst();
         System.out.println(val1);
         int val2=list.peek();
         System.out.println(val2);

    //      getLast()
         int val3=list.getLast();
         System.out.println(val3);

    //      removeFirst()/pop()/poll()
        list.removeFirst();
         System.out.println(list);

         list.pop();
         System.out.println(list);

         list.poll();
         System.out.println(list);

    //      removeLast() method
         list.removeLast();
         System.out.println(list);

    //      descendingIterator() method
         Iterator<Integer>iterator=list.descendingIterator();

         while(iterator.hasNext()){
             System.out.println(iterator.next());
         }

    //      lastIndexOf() method
      LinkedList<Integer>list1=new LinkedList<>();
         list1.add(7);
         list1.add(12);
         list1.add(31);
         list1.add(12);
         list1.add(12);
         list1.add(20);
         list1.add(8);
      System.out.println("list1: "+list1);
      System.out.println(list1.lastIndexOf(12));

    //   offer() method
      list1.offer(5100);
      System.out.println(list1);
    }
}
