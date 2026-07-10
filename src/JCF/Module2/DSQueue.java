package JCF.Module2;


/*
                         Queue (based on FIFO)
                           | (implements)
                 __________|___________
                |                      |
              Deque              PriorityQueue
                | (implements)
       _________|_________
      |                   |
  ArrayDeque          LinkedList






 // methods
- add(e): Inserts the element at the tail, throwing an exception if the queue is full.

- offer(e): Inserts the element at the tail, returning false if the queue is full.

- remove(): Retrieves and removes the head element, throwing an exception if empty.

- poll(): Retrieves and removes the head element, returning null if empty.

- element(): Retrieves but does not remove the head element, throwing an exception if empty.

- peek(): Retrieves but does not remove the head element, returning null if empty.





=========================================================================
                         QUEUE vs DEQUE IN JAVA
=========================================================================

CORE DEFINITIONS:
- Queue: A single-ended collection designed for holding elements prior to
  processing, typically ordering them in a First-In, First-Out (FIFO) manner.
- Deque: A double-ended queue (pronounced "deck") that allows elements to
  be inserted, removed, or inspected from both ends simultaneously.

STRUCTURAL DIFFERENCES:
- Access Points: A Queue restricts modification to two specific points (insert
  at the tail, remove from the head), whereas a Deque allows full insertion
  and removal at both the head and the tail.
- Interface Hierarchy: Deque is a sub-interface that extends the Queue
  interface, meaning every Deque is automatically a Queue, but not vice versa.
- Capabilities: A Queue can only act as a standard line/pipeline, while a
  Deque can act as a FIFO Queue, a LIFO Stack, or both at the same time.

METHOD AND OPERATIONAL DIFFERENCES:
- Method Variety: Queue provides 6 standard methods for basic linear
  operations, while Deque expands this contract to 12 specialized methods
  to target specific ends (addFirst/addLast, pollFirst/pollLast, etc.).
- Stack Support: Queue does not support stack behaviors, whereas Deque includes
  explicit push(), pop(), and peek() methods specifically for LIFO stack operations.
- Traversal: Queue only allows standard forward iteration, while Deque
  supports reverse traversal through its built-in descendingIterator() method.

COMMON IMPLEMENTATIONS:
- Queue Implementations: Commonly instantiated via PriorityQueue or LinkedList.
- Deque Implementations: Commonly instantiated via ArrayDeque (for resizable
  array backends) or LinkedList (for linked node backends).


=========================================================================
                         QUEUE vs DEQUE IN JAVA
=========================================================================




 */

import java.util.*;

public class DSQueue {
    static void main() {
    //     creation of Queue (3 ways)
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> ad=new ArrayDeque<>();
        Queue<Integer> pq=new PriorityQueue<>();



        // we are using offer() instead of add() so we don't have to do exception handling
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);

    //    we are using peek() instead of element() so we don't have to do exception handling
        System.out.println(q.peek());

    //     we are using poll() instead of remove() so we don't have to do exception handling
        System.out.println(q.poll());

        System.out.println(q);



    }
}
