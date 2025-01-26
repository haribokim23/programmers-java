package p120xxx.p120895;

// 제목 : 인덱스 바꾸기

class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();

        for (int index = 0; index < my_string.length(); index++) {
            if (index == num1) {
                sb.append(my_string.charAt(num2));
                continue;
            }

            if (index == num2) {
                sb.append(my_string.charAt(num1));
                continue;
            }

            sb.append(my_string.charAt(index));
        }

        return sb.toString();
    }
}
