package p120xxx.p120904;

// 제목 : 숫자 찾기

class Solution {
    public int solution(int num, int k) {
        String numString = Integer.toString(num);

        for (int index = 0; index < numString.length(); index++) {
            if (numString.charAt(index) - '0' == k) {
                return index + 1;
            }
        }

        return -1;
    }
}
