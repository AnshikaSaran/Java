public static void findMaxMin(int[] arr) {
        // Initialize max and min with the first element
        int max = arr[0];
        int min = arr[0];

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            // Update max if current element is greater
            if (arr[i] > max) {
                max = arr[i];
            } 
            // Update min if current element is smaller
            else if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Print max and min
        System.out.println("Max: " + max + ", Min: " + min);
    }
