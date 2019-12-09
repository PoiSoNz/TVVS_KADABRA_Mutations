public class BitWiseOperatorTest {
	
	public int K = 4;
	
	public BitWiseOperatorTest() {
		K = K & 3;
		int a = ~K;
		K = ~K;
		int c = 10 ^ K;
		K = K | 4;
		c = c | K;
	}
}
