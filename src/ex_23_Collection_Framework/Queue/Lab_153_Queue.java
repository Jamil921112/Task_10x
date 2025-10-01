package ex_23_Collection_Framework.Queue;

import java.util.PriorityQueue;

public class Lab_153_Queue {
    public static void main(String[] args) {
      // Queue , 0.1%   use in automation
        PriorityQueue queue = new PriorityQueue();
        queue.add("Pramod");
        queue.add("Dutta");
        System.out.println(queue);
        //Queue - First in first Out
        // Offer - add
//        peek - see the first element
        // poll - delete
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }

}
