
public class Bitset {
	public byte[] byteArray; // the array of bytes (8-bit integers)
	private int maxSize; // max # of set elements allowed
	// First 3 constructor methods

	public Bitset() // make an empty set of capacity zero.
	{
		maxSize = 0;
		byteArray = null;
	}

	// make a set able to hold 'size' elements each in range 0 .. size-1
	public Bitset(int size) {
		maxSize = size;
		int nbyte = (size + 7) / 8;
		byteArray = new byte[nbyte]; // new array, all zeroes
	}

	// make a copy of 'setA'
	public Bitset(Bitset setA) {
		maxSize = setA.maxSize;
		int nbyte = setA.byteArray.length;
		byteArray = new byte[nbyte]; // new array, all zeroes
		System.arraycopy(setA.byteArray, 0, byteArray, 0, setA.byteArray.length);
	}

	// Sets the bit at given offset from address byteArray to 1
	// i.e., adds element 'offset' to the set
	private void setBit(int n) {
		int whichByte = n / 8;
		int whichBit = n % 8;
		byteArray[whichByte] |= (1 << whichBit);
	}

	// Returns true if the bit at given offset from address
	// .. byteArray is set; else false.
	// i.e., determines whether element 'offset' is in the set
	public boolean getBit(int n) {
		int whichByte = n / 8;
		int whichBit = n % 8;
		return ((byteArray[whichByte] & (1 << whichBit)) != 0);
	}
}
