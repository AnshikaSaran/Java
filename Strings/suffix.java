    public static String BestRhyme(String S, String[] D) {
        int maxLen = 0;
        String bestRhyme = "No Word";
        for (String word : D) {
            int len = getCommonSuffixLength(S, word);
            if (len > maxLen) {
                maxLen = len;
                bestRhyme = word;
            }
        }
        return bestRhyme;
    }

    public static int getCommonSuffixLength(String s1, String s2) {
        int len = 0;
        for (int i = s1.length() - 1, j = s2.length() - 1; i >= 0 && j >= 0; i--, j--) {
            if (s1.charAt(i) == s2.charAt(j)) {
                len++;
            } else {
                break;
            }
        }
        return len;
    }
}
