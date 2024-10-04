public static char firstUniqueChar(String s) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        for (char c : s.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0';
    }

