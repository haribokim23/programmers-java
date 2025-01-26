package p120xxx.p120921;

// 제목 : 문자열 밀기

import java.util.*;

class Solution {
    public int solution(String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int length = a.length;

        for (int count = 0; count < length; count++) {
            if (Arrays.equals(a, b)) {
                return count;
            }

            char temp = a[length - 1];
            System.arraycopy(a, 0, a, 1, length - 1);
            a[0] = temp;
        }

        return -1;
    }
}
