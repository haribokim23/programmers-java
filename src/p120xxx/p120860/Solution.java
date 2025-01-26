package p120xxx.p120860;

// 제목 : 직사각형 넓이 구하기

class Solution {
    public int solution(int[][] dots) {
        int xMin = 256;
        int xMax = -256;
        int yMin = 256;
        int yMax = -256;

        for (int[] dot : dots) {
            int x = dot[0];
            int y = dot[1];
            xMin = Math.min(xMin, x);
            xMax = Math.max(xMax, x);
            yMin = Math.min(yMin, y);
            yMax = Math.max(yMax, y);
        }

        return (xMax - xMin) * (yMax - yMin);
    }
}
