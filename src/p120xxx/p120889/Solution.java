package p120xxx.p120889;

// 제목 : 삼각형의 완성조건 (1)

class Solution {
    public int solution(int[] sides) {
        int sum = 0;
        int max = 0;

        for (int side : sides) {
            sum += side;
            max = Math.max(max, side);
        }

        return max < sum - max ? 1 : 2;
    }
}
