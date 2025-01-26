package p120xxx.p120829;

// 제목 : 각도기

class Solution {
    public int solution(int angle) {
        return angle < 90 ? 1 : angle == 90 ? 2 : angle < 180 ? 3 : 4;
    }
}
