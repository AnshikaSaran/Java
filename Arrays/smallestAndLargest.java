public static void smallestAndLargest(int[] arr) {
    int smallest = arr[0], largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < smallest) {
            smallest = arr[i];
        } else if (arr[i] > largest) {
            largest = arr[i];
        }
    }
    System.out.println("Smallest: " + smallest);
    System.out.println("Largest: " + largest);
}
