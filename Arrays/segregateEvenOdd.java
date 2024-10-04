public static void segregateEvenOdd(int[] arr) {
    int nextEven = 0, nextOdd = arr.length - 1;
    while (nextEven < nextOdd) {
        if (arr[nextEven] % 2 == 0) {
            nextEven++;
        } else {
            swap(arr, nextEven, nextOdd--);
        }
    }
}
