public class Matrix {
	int[][] arr;

	//constructor
	public Matrix(int num1, int num2) {
		this.arr = new int[num1][num2];

		int row = 0;
		int col = 0;

		//loop through all elements and set to 1
		while (row < this.arr.length) {
			col = 0;
			while (col < num2) {
				this.arr[row][col] = 1;
				col++;
			}
			row++;
		}
	}

	public void setElement(int pos1, int pos2, int val) {
		this.arr[pos1][pos2] = val;
	}

	public void setRow(int row, String vals) {
		String[] arrVals = vals.split(",");
		int x = 0;

		if (this.arr[row].length == arrVals.length) {
			while (x < this.arr[row].length) {
				this.arr[row][x] = Integer.parseInt(arrVals[x]);
				x++;
			}
		}
		else {
			System.out.println("Number of Values Does Not Match Row Count");
		}
	}

	public void setColumn(int col, String vals) {
		String[] arrVals = vals.split(",");
		int x = 0;

		if (this.arr.length == arrVals.length) {
			while (x < this.arr.length) {
				this.arr[x][col] = Integer.parseInt(arrVals[x]);
				x++;
			}
		}
		else {
			System.out.println("Number of Values Does Not Match Column Count");
		}
	}

	public String toString() {
		String retVal = "[";

		for (int row = 0; row < this.arr.length; row++) {
			for (int col = 0; col < this.arr[row].length; col++) {
				retVal += this.arr[row][col];
				if (col < this.arr[row].length - 1) {
					retVal += ",";
				}
			}
			if (row < this.arr.length - 1) {
				retVal += ":";
			}
		}

		retVal += "]";

		return retVal;
	}

	public void prettyPrint() {
		String tmp = "";

		for (int row = 0; row < arr.length; row++) {
			tmp = "";
			for (int col = 0; col < arr[row].length; col++) {
				tmp += this.arr[row][col] + "\t";
			}
			System.out.println("Row " + row + ": " + tmp);
		}
	}

}