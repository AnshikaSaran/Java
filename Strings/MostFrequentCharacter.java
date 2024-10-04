    public static char MostFrequentCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        char mostFrequentChar = str.charAt(0);

        for (char c : str.toCharArray()) {
            // Update the frequency of the character
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            // Check if this character has become the most frequent
            if (frequencyMap.get(c) > maxFrequency) {
                maxFrequency = frequencyMap.get(c);
                mostFrequentChar = c;
            }
        }
        return mostFrequentChar;
    }
