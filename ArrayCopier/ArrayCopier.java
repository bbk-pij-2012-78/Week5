public class ArrayCopier {

	public void copy(int[] src, int[] dst) {
		int x = 0;

		while (x < dst.length) {
			if (x < src.length) {
				dst[x] = src[x];
			}
			else {
				dst[x] = 0;
			}
			x++;
		}
	}
}