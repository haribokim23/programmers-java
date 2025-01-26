package p120xxx.p120846;

// 제목 : 합성수 찾기

import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        int count = 0;

        for (int number = 4; number <= n; number++) {
            boolean isPrime = true;

            for (int prime : primes) {
                if (number % prime == 0) {
                    isPrime = false;
                    count++;
                    break;
                }
            }

            if (isPrime) {
                primes.add(number);
            }
        }

        return count;
    }
}
