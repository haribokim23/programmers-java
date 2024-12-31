package p120xxx.p120824;

// 제목 : 짝수 홀수 개수

class Solution {
    public int[] solution(int[] num_list) {
        int[] counts = new int[2];

        for (int number : num_list) {
            counts[number % 2]++;
        }

        return counts;
    }
}
