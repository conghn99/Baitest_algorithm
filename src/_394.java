public class _394 {
    public String decodeString(String s) {
        StringBuilder cur = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
            } else if (s.charAt(i) == '[') {
                //tìm ] tương ứng
                int begin = i;
                i++;
                int count = 1;
                while (count != 0) { //count = 0 thì đã tìm dc ] tương ứng
                    if (s.charAt(i) == '[') {
                        count++;
                    } else if (s.charAt(i) == ']') {
                        count--;
                    }
                    i++;
                }
                i--;

                String subStr = decodeString(s.substring(begin + 1, i));
                for (int k = 0; k < num; k++) {
                    cur.append(subStr);
                }
                num = 0;
            } else {
                cur.append(s.charAt(i));
            }
        }
        return cur.toString();
    }
}
