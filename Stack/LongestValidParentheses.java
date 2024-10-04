    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        int lastInvalidIndex = -1; // Tracks the last invalid index

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i); // Push the index of the '('
            } else {
                if (stack.isEmpty()) {
                    // If we encounter a ')', and there's no matching '(', update last invalid index
                    lastInvalidIndex = i;
                } else {
                    // We found a matching pair
                    stack.pop();
                    if (stack.isEmpty()) {
                        // If the stack is empty, calculate the length from last invalid index
                        maxLength = Math.max(maxLength, i - lastInvalidIndex);
                    } else {
                        // If the stack is not empty, calculate the length using the index of the last unmatched '('
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                }
            }
        }
        return maxLength;
    }
