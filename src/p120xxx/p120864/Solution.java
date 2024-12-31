package p120xxx.p120864;

// 제목 : 숨어있는 숫자의 덧셈 (2)

class Solution {
    public int solution(String my_string) {
        int sum = 0;
        int number = 0;

        for (int index = 0; index < my_string.length(); index++) {
            char character = my_string.charAt(index);

            if (Character.isDigit(character)) {
                number = number * 10 + character - '0';
                continue;
            }

            sum += number;
            number = 0;
        }

        return number == 0 ? sum : sum + number;
    }
}
