int[] srcArray = {1, 2, 5, 8, 9};
int dstArray;
ArrayCopier ac = new ArrayCopier();

dstArray = new int[4];

ac.copy(srcArray, dstArray);

int x = 0;

while (x <= dstArray.length()) {
    println(dstArray[x];
}