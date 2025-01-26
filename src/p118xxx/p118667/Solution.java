package p118xxx.p118667;

// 제목 : 두 큐 합 같게 만들기

import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long sum1 = 0;
        long sum2 = 0;
        LinkedList<Integer> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();

        for (int index = 0; index < queue1.length; index++) {
            int element1 = queue1[index];
            int element2 = queue2[index];
            sum1 += element1;
            sum2 += element2;
            q1.addLast(element1);
            q2.addLast(element2);
        }

        long sum = sum1 + sum2;

        if (sum % 2 == 1) {
            return -1;
        }

        sum /= 2;
        int count = 0;

        while (sum1 != sum) {
            if (q1.isEmpty() || q2.isEmpty() || count > queue1.length * 3) {
                return -1;
            }

            count++;

            if (sum1 < sum2) {
                int element = q2.removeFirst();
                sum2 -= element;
                q1.addLast(element);
                sum1 += element;
                continue;
            }

            int element = q1.removeFirst();
            sum1 -= element;
            q2.addLast(element);
            sum2 += element;
        }

        return count;
    }
}
