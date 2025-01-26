package p120xxx.p120875;

// 제목 : 평행

class Solution {
    public int solution(int[][] dots) {
        double slope01 = ((double) dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        double slope02 = ((double) dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        double slope03 = ((double) dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        double slope12 = ((double) dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
        double slope13 = ((double) dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        double slope23 = ((double) dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        return slope01 == slope23 ? 1 : slope02 == slope13 ? 1 : slope03 == slope12 ? 1 : 0;
    }
}
