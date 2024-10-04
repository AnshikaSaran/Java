public static int findMissingNumber(int[] arr, int n) {
        int sum = 0; 
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        int total = (n * (n + 1)) / 2;
        return total - sum; 
    }
}

//By using XOR operation
public static int findMissingNumber(int[] arr, int n) {
        int xor1 = 0, xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < n - 1; i++) {
            xor2 ^= arr[i];
        }

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // Missing number is XOR of xor1 and xor2
        return xor1 ^ xor2;
    }
}
//Time Complexity: O(n)
//Space: O(1)


