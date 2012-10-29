public class MatrixTester {
	public static void main(String[] args){

		//initilise the arry
		Matrix mtx = new Matrix(6, 3);
		System.out.println("Array Initialised");
		mtx.prettyPrint();

		//set an element
		mtx.setElement(2, 1, 7);
		System.out.println("Element Set");
		mtx.prettyPrint();

		//set a row
		mtx.setRow(4, "6,6,6");
		System.out.println("Row Set");
		mtx.prettyPrint();

		//set a row
		mtx.setColumn(2, "5,5,5,5,5,5");
		System.out.println("Row Set");
		mtx.prettyPrint();

		System.out.println("To String");
		System.out.println(mtx.toString());

	}
}