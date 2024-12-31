package p120xxx.p120911;

// 제목 : 문자열 정렬하기 (2)

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        char[] characters = my_string.toCharArray();
        Arrays.sort(characters);
        StringBuilder sb = new StringBuilder();

        for (char character : characters) {
            sb.append(character);
        }

        return sb.toString();
    }
}
