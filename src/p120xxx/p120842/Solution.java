package p120xxx.p120842;

// 제목 : 2차원으로 만들기

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[][] twoD = new int[length / n][n];

        for (int index = 0; index < length; index++) {
            twoD[index / n][index % n] = num_list[index];
        }

        return twoD;
    }
}
