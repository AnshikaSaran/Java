public static int LIS(int[] arr) {
    int[] dp = new int[arr.length];
    int maxLength = 0;
    for (int i = 0; i < arr.length; i++) {
        dp[i] = 1;
        for (int j = 0; j < i; j++) {
            if (arr[i] > arr[j]) {
                dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        maxLength = Math.max(maxLength, dp[i]);
    }
    return maxLength;
}
