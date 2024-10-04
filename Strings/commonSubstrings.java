public static String[] commonSubstrings(String str1, String str2) {
    List<String> commonSubstrings = new ArrayList<>();
    for (int i = 0; i < str1.length(); i++) {
        for (int j = i + 1; j <= str1.length(); j++) {
            String substr = str1.substring(i, j);
            if (str2.contains(substr)) {
                commonSubstrings.add(substr);
            }
        }
    }
    return commonSubstrings.toArray(new String
}
