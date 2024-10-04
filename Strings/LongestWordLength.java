public static int LongestWordLength(String sentence) {
        String[] words = sentence.split(" ");
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        return maxLength;
    }
}
