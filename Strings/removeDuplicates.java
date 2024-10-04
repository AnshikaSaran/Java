public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
