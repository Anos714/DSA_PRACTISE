package JCF.Module1;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Stack;

// hw-> use Arraydeque instead of stack

/*
4. Stack -> Based on LIFO principle

-- Creation of Stack
Stack<Integer> s=new Stack<>();

-- Stack Methods:-
- push(E item):- Pushes an item onto the absolute top of the stack.

- pop():- Removes and returns the object at the top of the stack.

- peek():- Looks at the top object without removing it from the stack.

- empty():- Checks if the stack has no elements.

- search(Object o):- Searches for an object and returns its 1-based position from the top.
 */

public class DSStack {
    static void main() {
        Stack<Integer>s=new Stack<>();
        Stack<String>s1=new Stack<>();

        // push() method
        s.push(12);
        s.push(22);
        s.push(7);
        s.push(15);
        s.push(3);
        s.push(32);

        s1.push("rahul");
        s1.push("mahesh");
        s1.push("rajesh");
        s1.push("hemant");
        s1.push("nitin");

        System.out.println(s);
        System.out.println(s1);


    // pop() method
        s.pop();
        System.out.println(s);

        s1.pop();
        System.out.println(s1);

    //  peek() method
        System.out.println(s.peek());
        System.out.println(s1.peek());


    //  empty() method
        System.out.println(s.empty());
        System.out.println(s1.empty());

    //     search() method
    //     System.out.println(s.search(22));//4
        System.out.println(s1.search("hemant"));//1

    //     iterating the stack
        Iterator<Integer>i=s.iterator();
        while(i.hasNext()){
            System.out.println("Integer Stack: "+i.next());
        }

        Iterator<String>j=s1.iterator();
        while(j.hasNext()){
            System.out.println("String Stack: "+j.next());
        }

    //     sort() method
    //     ascending
        s.sort(Comparator.naturalOrder());
        System.out.println(s);

        s1.sort(Comparator.naturalOrder());
        System.out.println(s1);

    //     descending
        s.sort(Comparator.reverseOrder());
        System.out.println(s);

        s1.sort(Comparator.reverseOrder());
        System.out.println(s1);




    }
}
