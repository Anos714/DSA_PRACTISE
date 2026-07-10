package JCF.Module2;

/*
 -- creation of Priority Queue
 Queue<Integer> pq=new PriorityQueue<>();
 PriorityQueue<Integer> pq=new PriorityQueue<>();



 */


import java.util.Comparator;
import java.util.PriorityQueue;

public class DSPriorityQueue {
    static void main() {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        // default behavior -> in case of integer -> less value -> high priority

        // this default behaviour in case of integer in priority queue is also in minHeap DS.

        // by applying Comparator.reverseOrder() it becoimes maxHeap DS means high value -> high priority

        pq.offer(40);
        pq.offer(60);
        pq.offer(10);
        pq.offer(35);


        pq1.offer(40);
        pq1.offer(60);
        pq1.offer(10);
        pq1.offer(35);

        System.out.println(pq);

        System.out.println(pq.poll());//10
        System.out.println(pq.poll());//35
        System.out.println(pq.poll());//40
        System.out.println(pq.poll());//60

        System.out.println(pq1);

        System.out.println(pq1.poll());//60
        System.out.println(pq1.poll());//40
        System.out.println(pq1.poll());//35
        System.out.println(pq1.poll());//10

    }


}
