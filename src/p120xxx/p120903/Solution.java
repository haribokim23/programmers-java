package p120xxx.p120903;

// 제목 : 배열의 유사도

import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, s1);
        int count = 0;

        for (String s : s2) {
            if (set.contains(s)) {
                count++;
            }
        }

        return count;
    }
}
