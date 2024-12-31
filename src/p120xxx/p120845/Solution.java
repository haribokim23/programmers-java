package p120xxx.p120845;

// 제목 : 주사위의 개수

class Solution {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
