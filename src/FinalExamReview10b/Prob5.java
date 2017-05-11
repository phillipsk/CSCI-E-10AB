public class Prob5 {
	public static void main(String[] args) {
		Bitset setA = new Bitset();
		setA.byteArray = new byte[] {16};
		setA.byteArray[0] ^= 17;
		boolean bit = setA.getBit(0);
		if(bit){
			System.out.println("The value 17 was not present in the setA ");
		}else{
			System.out.println("The value 17 was removed from setA");
		}
	}
}
