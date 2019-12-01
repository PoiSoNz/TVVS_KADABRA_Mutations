public class GrandeTeste {

	private static int K = 0;

	/**
	 * Edge detection operation that uses three convolution steps:
	 *   1. Gaussian
	 *   2. Vertical
	 *   3. Horizontal
	 * A binary image is outputed based on a threshold.
	 */
	public static int GrandeTeste(int[][] inputImage) {
		K = 3;
		int c = ~K;
		int d = K;
		int e = ~5;
		K += 1;
		K = ~K;
		K = K | 4;
		
		Boolean b = K < 4;
		
		return K;
	}
}