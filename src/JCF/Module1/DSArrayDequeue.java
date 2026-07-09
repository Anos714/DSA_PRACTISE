package JCF.Module1;

/*
4. ArrayDeque -> Based on true LIFO principle

-- Creation of ArrayDeque
ArrayDeque<Integer> s=new ArrayDeque<>();

-- ArrayDeque Methods:-
- push(E item):- Pushes an item onto the absolute top of the stack.

- pop():- Removes and returns the object at the top of the stack.

- peek():- Looks at the top object without removing it from the stack.

- empty():- Checks if the stack has no elements.

- it does not provide search() method beacuse it is specifically for Stack

 */


import java.util.ArrayDeque;

public class DSArrayDequeue {
    static void main() {
        ArrayDeque<Integer> ard=new ArrayDeque<>();
        ard.addFirst(12);
        System.out.println(ard);

        ard.push(15);
        ard.push(16);
        ard.push(17);
        ard.push(18);
        ard.push(19);
        System.out.println(ard);

        ard.pop();
        System.out.println(ard);

        System.out.println(ard.peek());
        System.out.println(ard.isEmpty());



    }
}
