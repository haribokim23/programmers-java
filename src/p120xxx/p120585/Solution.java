package p120xxx.p120585;

// 제목 : 머쓱이보다 키 큰 사람

class Solution {
    public int solution(int[] array, int height) {
        int count = 0;

        for (int h : array) {
            if (h > height) {
                count++;
            }
        }

        return count;
    }
}
