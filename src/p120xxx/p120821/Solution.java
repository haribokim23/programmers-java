package p120xxx.p120821;

// 제목 : 배열 뒤집기

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;

        for (int index = 0; index <= length / 2; index++) {
            int temp = num_list[index];
            int swapIndex = length - index - 1;
            num_list[index] = num_list[swapIndex];
            num_list[swapIndex] = temp;
        }

        return num_list;
    }
}
