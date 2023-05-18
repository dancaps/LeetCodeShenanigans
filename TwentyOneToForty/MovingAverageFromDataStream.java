package TwentyOneToForty;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverageFromDataStream {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));

        System.out.println("Expected Output: 1.0, 5.5, 4.66667, 6.0");
    }
}

class MovingAverage {
    Deque<Integer> queue = new ArrayDeque<>();
    int size;
    int count = 0;
    int sum = 0;

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        count++;
        if (queue.size() < size) {
            sum += val;
            queue.addLast(val);
        } else {
            sum -= queue.poll();
            sum += val;
            queue.addLast(val);
        }

        return 1.0 * sum / Math.min(count, size);

    }
}
