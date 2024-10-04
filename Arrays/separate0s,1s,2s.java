public static void separate(int[] arr) {
    int low = 0, high = arr.length - 1, mid = 0;
    while (mid <= high) {
        switch (arr[mid]) {
            case 0:
                swap(arr, low++, mid++);
                break;
            case 1:
                mid++;
                break;
            case 2:
                swap(arr, mid, high--);
                break;
        }
    } public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
