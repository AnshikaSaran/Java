
// Iterative Approach
static boolean arraySort(int[] arr, int n) {
    if (n == 0 || n == 1) {
        return true; 
    }
    
    for (int i = 1; i < n; i++) {
        // Unsorted pair found
        if (arr[i - 1] > arr[i]) {
            return false;
        }
    }
    // No unsorted pair found
    return true;
}


//Time Complexity: O(n)
//Space: O(1)


// Recursive Approach

static boolean arraySort(int[] a, int n) {
    if (n == 1 || n == 0) {
        return true; 
    }
    return a[n - 1] >= a[n - 2] && arraySort(a, n - 1);
}


//Time Complexity: O(n)
//Space: O(n) 
