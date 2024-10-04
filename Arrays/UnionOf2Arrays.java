public static int[] findUnion(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
    for (int num : arr1) {
        set.add(num);
    }
    for (int num : arr2) {
        set.add(num);
    }
    return set.stream().mapToInt(i -> i).toArray();
}
