package p120xxx.p120815;

// 제목 : 피자 나눠 먹기 (2)

class Solution {
    public int solution(int n) {
        int count = 1;

        while (6 * count % n != 0) {
            count++;
        }

        return count;
    }
}
