package p120xxx.p120851;

// 제목 : 숨어있는 숫자의 덧셈 (1)

class Solution {
    public int solution(String my_string) {
        int sum = 0;

        for (int index = 0; index < my_string.length(); index++) {
            char character = my_string.charAt(index);

            if (Character.isDigit(character)) {
                sum += character - '0';
            }
        }

        return sum;
    }
}
