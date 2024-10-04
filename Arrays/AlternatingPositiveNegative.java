public static void rearrange(int[] arr) {
    int positiveIndex = 0, negativeIndex = 0;
    while (positiveIndex < arr.length && negativeIndex < arr.length) {
        if (arr[positiveIndex] < 0) {
            positiveIndex++;
        } else if (arr[negativeIndex] > 0) {
            negativeIndex++;
        } else {
            swap(arr, positiveIndex++, negativeIndex++);
        }
    }
}
