public static boolean PairWithGivenSum(int[] arr, int targetSum) {
    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
        if (set.contains(targetSum - num)) {
            return true;
        }
        set.add(num);
    }
    return false;
}
