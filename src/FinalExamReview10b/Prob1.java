import java.util.ArrayList;

public class Prob1 {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(10);
		A.add(20);
		A.add(30);
		prob1(A);
	}

	public static void prob1(ArrayList<Integer> list) {
		// iterate the list in reverse order
		for (int i = list.size() - 1; i >= 0; i--) {
			// if current index is even, add the element at current index to the
			// end of the list
			if (i % 2 == 0)
				list.add(list.get(i));
			// else add the element at current index to the beginning of the
			// list
			else
				list.add(0, list.get(i));
		}
		System.out.println(list);
	}
}


/**
 * i = 2 : 10, 20, 30, 30
 * i = 1 : 20, 10, 20, 30, 30
 * i = 0 : 20, 10, 20, 30, 30, 20
 */