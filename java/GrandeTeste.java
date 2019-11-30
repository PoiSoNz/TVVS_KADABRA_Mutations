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
		K += 1;
		K = ~K;
		
		return K;
	}
}