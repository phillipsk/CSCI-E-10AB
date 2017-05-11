public abstract class Prez // second class
{
	public void republican() {
		System.out.println("Republican Prez");
	}

	public void democrat() {
		republican();
		System.out.println("Democratic Prez ");
	}

	public String toString() {
		return "I am the President!";
	}
}