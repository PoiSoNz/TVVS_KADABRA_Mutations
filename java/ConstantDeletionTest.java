public class ConstantDeletionTest {
	
	final int a = 14;
	final int b = 21321;
	final int c = 1212;
	final int d = 244;
	int h = 244;
	public ConstantDeletionTest() {
		int e = a;
		e = b;
		e = 3;
		int f = a * 3;
		f = a + a;
		f = b + c - d + 3 + e;
		
		if(c < d + 3 * a / (c * c)- 2) {
			f = b/a + d;
			boolean i = c + d + 2 > a + 3 * b / d - 2;
			
			final int g = 3;
			e = g * c + h;
		}
		
		int g = 1;
		e = h + g * 2;
	}
	
}