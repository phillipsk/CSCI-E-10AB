import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Prob4 {
	public static void s2q(Stack<Integer> s, Queue<Integer> q) {
		while (!s.isEmpty())
			q.add(s.pop());
	}

	public static void q2s(Queue<Integer> q, Stack<Integer> s) {
		while (!q.isEmpty())
			s.push(q.remove());
	}

	public static boolean isSorted(Stack<Integer> s) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		s2q(s, q);
		Integer pop = q.remove();
		Iterator<Integer> iterator = q.iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			if (next > pop) {
				return false;
			} else {

			}
			pop = next;
		}
		return true;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();

		s.push(-12);
		s.push(0);
		s.push(1);
		s.push(8);
		s.push(8);
		s.push(8);

		boolean sorted = isSorted(s);
		System.out.println(sorted);
	}
}
