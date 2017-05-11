package FInal

public class Prob3 {
	public static void main(String[] args) {
		Prez[] p = { new FDR(), new Lincoln(), new Truman() };
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			p[i].democrat();
			p[i].republican();
			System.out.println();
		}
	}
}
