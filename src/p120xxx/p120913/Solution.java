package p120xxx.p120913;

// 제목 : 잘라서 배열로 저장하기

class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        int count = (length - 1) / n + 1;
        String[] strings = new String[count];

        for (int index = 0; index < count; index++) {
            int start = index * n;
            strings[index] = my_str.substring(start, Math.min(start + n, length));
        }

        return strings;
    }
}
