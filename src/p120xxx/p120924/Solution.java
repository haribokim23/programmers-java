package p120xxx.p120924;

// 제목 : 다음에 올 숫자

class Solution {
    public int solution(int[] common) {
        int length = common.length;

        if (common[1] - common[0] == common[2] - common[1]) {
            return common[length - 1] + common[1] - common[0];
        }

        return common[length - 1] * common[1] / common[0];
    }
}
