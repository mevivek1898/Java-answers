The Queue interface in collection hierarchy represents a real-world queue (meaning a line of waiting people or vehicles).

In the above statement, attention should be paid to the word waiting.

Let us consider some people standing in queue at a movie ticket counter. The person who enters the queue first gets a chance to buy the tickets first. While the person in the front of the queue is being served, the remaining persons are waiting.

In programming, we use a Queue to store elements which usually need to be processed in the order they have been inserted into the Queue, i.e: first-in-first-out (FIFO).

There are special queue implementations which do not always follow the first-in-first-out (FIFO) concept, for example PriorityQueue and DelayQueue.

Apart from the methods inherited from the Collection interface, Queue interface provides some special methods like :
offer(E element) - used to insert elements into a Queue
poll() - used to retrieve and remove the element at the head/front of the Queue
peek() - used to retrieve and not remove the element at the head/front of the Queue
Click on  to understand the working of the various methods in Queue.

The Deque interface extends Queue.

A Deque represents a double ended queue, which facilitates addition and removal from both ends.

ArrayDeque class is a concrete implementation of Deque interface. Which means that whenever we want a simple queue or a double-ended queue implementation we can use an instance of ArrayDeque.

Click on  to understand the working of various methods in ArrayDeque.

ArrayDeque does not permit null elements. It is recommended to be used as a replacement for the java.util.Stack and java.util.LinkedList as it is much faster than both of them.

See and retype the below code which demonstrates the usage of ArrayDeque as a queue as a stack and as a double ended queue.
.


package q11384;
import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque arrayDeque = new ArrayDeque();
		//below code uses it as a queue
		arrayDeque.offer("Ganga");
		arrayDeque.offer("Yamuna");
		arrayDeque.offer("Narmada");
		System.out.println("after all offers calls : " + arrayDeque);
		System.out.println("poll returns : " + arrayDeque.poll());
		System.out.println("after calling poll : " + arrayDeque);
		//below code uses it as a stack
		arrayDeque.push("Krishna");
		arrayDeque.push("Godavari");
		System.out.println("after all push calls : " + arrayDeque);
		System.out.println("pop returns : " + arrayDeque.pop());
		System.out.println("after calling pop : " + arrayDeque);
		//below code uses it as a double ended queue
		arrayDeque.offerFirst("Indus");
		arrayDeque.offerLast("Ravi");
		System.out.println("arrayDeque after offerFirst and offerLast calls : " + arrayDeque);
	}
}