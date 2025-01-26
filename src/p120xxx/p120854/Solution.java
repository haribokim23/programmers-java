package p120xxx.p120854;

// 제목 : 배열 원소의 길이

class Solution {
    public int[] solution(String[] strlist) {
        int length = strlist.length;
        int[] lengths = new int[length];

        for (int index = 0; index < length; index++) {
            lengths[index] = strlist[index].length();
        }

        return lengths;
    }
}
