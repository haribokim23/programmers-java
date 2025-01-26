package p120xxx.p120583;

// 제목 : 중복된 숫자 개수

class Solution {
    public int solution(int[] array, int n) {
        int count = 0;

        for (int number : array) {
            if (number == n) {
                count++;
            }
        }

        return count;
    }
}
