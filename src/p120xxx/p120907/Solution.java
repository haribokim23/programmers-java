package p120xxx.p120907;

// 제목 : OX퀴즈

import java.util.StringTokenizer;

class Solution {
    public String[] solution(String[] quiz) {
        int length = quiz.length;
        String[] answers = new String[length];

        for (int index = 0; index < length; index++) {
            StringTokenizer st = new StringTokenizer(quiz[index]);
            int number = Integer.parseInt(st.nextToken());

            if (st.nextToken().equals("+")) {
                number += Integer.parseInt(st.nextToken());
            } else {
                number -= Integer.parseInt(st.nextToken());
            }

            st.nextToken();
            answers[index] = number == Integer.parseInt(st.nextToken()) ? "O" : "X";
        }

        return answers;
    }
}
