package p120xxx.p120902;

// 제목 : 문자열 계산하기

import java.util.StringTokenizer;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int result = Integer.parseInt(st.nextToken());

        while (st.hasMoreTokens()) {
            if (st.nextToken().equals("+")) {
                result += Integer.parseInt(st.nextToken());
                continue;
            }

            result -= Integer.parseInt(st.nextToken());
        }

        return result;
    }
}
