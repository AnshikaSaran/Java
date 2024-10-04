public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String res = "";
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(res);
                res = "";
                num = 0;
            } else if (c == ']') {
                int count = numStack.pop();
                String prev = strStack.pop();
                StringBuilder sb = new StringBuilder(prev);
                for (int i = 0; i < count; i++) {
                    sb.append(res);
                }
                res = sb.toString();
            } else {
                res += c;
            }
        }
        return res;
    }
DecodeString.java
