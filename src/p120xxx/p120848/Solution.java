package p120xxx.p120848;

// 제목 : 팩토리얼

class Solution {
    public int solution(int n) {
        int i = 1;

        for (int factorial = 1; factorial <= n; ) {
            factorial *= ++i;

            if (factorial > n) {
                i--;
                break;
            }
        }

        return i;
    }
}
