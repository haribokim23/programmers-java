package p120xxx.p120853;

// 제목 : 컨트롤 제트

import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int number = 0;
        int sum = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();

            if (token.equals("Z")) {
                sum -= number;
                continue;
            }

            number = Integer.parseInt(token);
            sum += number;
        }

        return sum;
    }
}
