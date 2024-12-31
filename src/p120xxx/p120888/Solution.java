package p120xxx.p120888;

// 제목 : 중복된 문자 제거

import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        HashSet<Character> characters = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < my_string.length(); index++) {
            char character = my_string.charAt(index);

            if (!characters.contains(character)) {
                characters.add(character);
                sb.append(character);
            }
        }

        return sb.toString();
    }
}
