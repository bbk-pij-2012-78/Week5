public class Tester {
	public static void main(String[] args){
		int[] srcArray = {1, 2, 5, 8, 9};
		ArrayCopier ac = new ArrayCopier();

		int[] dstArray = new int[3];
		ac.copy(srcArray, dstArray);

		int x = 0;

		while (x < dstArray.length) {
			System.out.println(dstArray[x]);
			x++;
		}
	}
}