package p120xxx.p120863;

// 제목 : 다항식 더하기

import java.util.StringTokenizer;

class Solution {
    public String solution(String polynomial) {
        StringTokenizer st = new StringTokenizer(polynomial, " +");
        int a = 0;
        int b = 0;

        while (st.hasMoreTokens()) {
            String term = st.nextToken();

            if (term.endsWith("x")) {
                int length = term.length();
                a += length == 1 ? 1 : Integer.parseInt(term.substring(0, term.length() - 1));
                continue;
            }

            b += Integer.parseInt(term);
        }

        StringBuilder sb = new StringBuilder();

        if (a > 1) {
            sb.append(a);
        }

        if (a >= 1) {
            sb.append("x");
        }

        if (b != 0) {
            if (sb.length() != 0) {
                sb.append(" + ");
            }

            sb.append(b);
        }

        return sb.toString();
    }
}
