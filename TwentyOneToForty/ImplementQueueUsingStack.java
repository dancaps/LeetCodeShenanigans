package TwentyOneToForty;

/**
 * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the
 * functions of a normal queue (push, peek, pop, and empty).
 *
 * Implement the MyQueue class:
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is
 * empty operations are valid.
 * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or
 * deque (double-ended queue) as long as you use only a stack's standard operations.
 *
 * Example 1:
 * Input
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 1, 1, false]
 *
 * Explanation
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1); // queue is: [1]
 * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
 * myQueue.peek(); // return 1
 * myQueue.pop(); // return 1, queue is [2]
 * myQueue.empty(); // return false
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueUsingStack {

    public static void main(String[] args) {
        System.out.println();
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println("Expected: 1, Actual: " + myQueue.peek()); // return 1
        System.out.println("Expected: 1, Actual: " + myQueue.pop()); // return 1, queue is [2]
        System.out.println("Expected: false, Actual: " + myQueue.empty()); // return false
    }
}

class MyQueue {

    Deque<Integer> queue = new ArrayDeque<>();

    public MyQueue() {

    }

    public void push(int x) {
        this.queue.addLast(x);
    }

    public int pop() {
        return this.queue.pop();
    }

    public int peek() {
        return this.queue.peek();
    }

    public boolean empty() {
        return this.queue.isEmpty();

    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
