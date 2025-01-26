package p120xxx.p120852;

// 제목 : 소인수분해

import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> primes = new ArrayList<>();

        for (int prime = 2; n > 1; prime++) {
            while (n % prime == 0) {
                if (!primes.contains(prime)) {
                    primes.add(prime);
                }

                n /= prime;
            }
        }

        int length = primes.size();
        int[] factors = new int[length];

        for (int index = 0; index < length; index++) {
            factors[index] = primes.get(index);
        }

        return factors;
    }
}
