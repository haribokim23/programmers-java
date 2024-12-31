package p120xxx.p120825;

// 제목 : 문자 반복 출력하기

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < my_string.length(); index++) {
            sb.append(my_string.substring(index, index + 1).repeat(n));
        }

        return sb.toString();
    }
}
