package p120xxx.p120850;

// 제목 : 문자열 정렬하기 (1)

import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int length = my_string.length();
        int[] numbers = new int[length];
        int count = 0;

        for (int index = 0; index < length; index++) {
            char character = my_string.charAt(index);

            if (Character.isDigit(character)) {
                numbers[count++] = character - '0';
            }
        }

        int[] copy = new int[count];
        System.arraycopy(numbers, 0, copy, 0, count);
        Arrays.sort(copy);
        return copy;
    }
}
