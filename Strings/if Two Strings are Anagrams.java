public static boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }
    // Create frequency arrays for both strings
    int[] frequency1 = new int[256]; // Assuming ASCII character set
    int[] frequency2 = new int[256]; // Assuming ASCII character set

    // Count frequency of each character in both strings
    for (int i = 0; i < str1.length(); i++) {
        frequency1[str1.charAt(i)]++;
        frequency2[str2.charAt(i)]++;
    }
    return Arrays.equals(frequency1, frequency2);
}
