package p120xxx.p120841;

// 제목 : 점의 위치 구하기

class Solution {
    public int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        return y > 0 ? x > 0 ? 1 : 2 : x < 0 ? 3 : 4;
    }
}
