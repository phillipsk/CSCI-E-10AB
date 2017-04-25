package Pset7;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 4/23/17
 */

/*

Recall the LinkedQueue.java code (see the unit7 folder in the “Lecture
Examples” page of our course website).

A simple variation of the ordinary queue data type is a dequeue (short for
“double-ended queue”). Such a data structure allows a user to add new elements to
either end (the head or the tail), as well as to delete an element from either end.

The LinkedDequeue will be singly linked (as in LinkedQueue), and data
members should be kept private. Modify the code in LinkedQueue.java to
create LinkedDequeue.java, with the following public methods.

✦ LinkedDequeue ()
 Constructor that creates an empty Dequeue .

✦ void headAdd (Object o)
Insert an item into the Dequeue at the head.

✦ Object headPeek ()
Peek at the head of the Dequeue.

✦ Object headRemove ()
Remove an item from head of the Dequeue, just like method delete in

LinkedQueue.java
✦ boolean isEmpty ()
Returns true if Dequeue contains no elements; else returns false

✦ int size()
Returns the number of elements currently in the Dequeue

✦ void tailAdd (Object o)
Insert an item into the Dequeue at the tail, just like the method add in LinkedQueue.java

✦ Object tailPeek()
Peek at the tail of the Dequeue. In other words, return the value at the tail,
without removing it.
✦ Object tailRemove()
Remove an item from the tail of the Dequeue.
✦ String toString()
Outputs, in a neatly formatted fashion, all objects in the queue, from the head
through the tail. The objects should print out one per line!
You must write a main program to demonstrate that all of the above methods
work correctly, perhaps by adding and deleting String objects from both ends of a
dequeue. Note that the two “peek” methods let the user see whatever object is at
the head or tail of the queue, without actually removing the object. Be aware that
some of the methods that already exist in LinkedQueue.java can simply be
renamed as part of your solution.
For 5 points of extra credit: invent a new Exception type named
DequeueUnderFlowException that gets thrown when one tries to remove or
peek at an element from an already empty queue. This feature should be
demonstrated in your main program.

 */
public class LinkedDequeue {

	private QueueNode rear;
	private QueueNode front;
	private int count;

	class QueueNode // an inner class
	{
		private Object item;
		private QueueNode link;
	}

	public LinkedDequeue() {
		rear = front = null;
		count = 0;
	}

	public void headAdd(Object o) {
		QueueNode temp = new QueueNode();
		temp.item = o;
		temp.link = null;

		if (isEmpty())
			front = rear = temp;
		else {
			temp.link = front;
			front = temp;
		}
		count++;
	}

	public Object headPeek() {
		if (!isEmpty())
			return front.item;
		return null;
	}

	public Object headRemove() throws DequeueUnderFlowException {
		if (isEmpty())
			throw new DequeueUnderFlowException();

		QueueNode removed = null;
		if (size() == 1) {
			removed = front;
			front = rear = null;
		} else {
			removed = front;
			front = front.link;
			count--;
		}
		return removed.item;
	}

	public boolean isEmpty() {
		return (count == 0);
	}

	public int size() {
		return count;
	}

	public void tailAdd(Object o) {
		QueueNode temp = new QueueNode();
		temp.item = o;
		temp.link = null;

		if (isEmpty())
			front = rear = temp;
		else {
			rear.link = temp;
			rear = temp;
		}
		count++;
	}

	public Object tailPeek() {
		if (!isEmpty()) {
			return rear.item;
		}
		return null;
	}

	public Object tailRemove() throws DequeueUnderFlowException {
		if (isEmpty())
			throw new DequeueUnderFlowException();

		QueueNode removed = null;
		if (size() == 1) {
			removed = front;
			front = rear = null;
		} else {
			QueueNode temp = front;
			while (temp.link != rear) {
				temp = temp.link;
			}
			removed = rear;
			rear = temp;
			rear.link = null;           
		}
		count--;
		return removed.item;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Dequeue [\n");
		QueueNode temp = front;
		while (temp != null) {
			sb.append(temp.item.toString()).append("\n");
			temp = temp.link;
		}
		sb.append("]");
		return sb.toString();
	}
}
