public static int[] findIntersection(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
    List<Integer> result = new ArrayList<>();
    for (int num : arr1) {
        set.add(num);
    }
    for (int num : arr2) {
        if (set.contains(num)) {
            result.add(num);
        }
    }
    return result.stream().mapToInt(i -> i).toArray();
}
