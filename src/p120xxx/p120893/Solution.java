package p120xxx.p120893;

// 제목 : 대문자와 소문자

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int difference = 'a' - 'A';

        for (int index = 0; index < my_string.length(); index++) {
            char character = my_string.charAt(index);
            sb.append((char) (character + difference * (character < 'a' ? 1 : -1)));
        }

        return sb.toString();
    }
}
