package p120xxx.p120894;

// 제목 : 영어가 싫어요

class Solution {
    public long solution(String numbers) {
        long number = 0;

        for (int index = 0; index < numbers.length(); ) {
            number *= 10;

            switch (numbers.charAt(index)) {
                case 'z':
                    index += 4;
                    break;
                case 'o':
                    number += 1;
                    index += 3;
                    break;
                case 't':
                    switch (numbers.charAt(index + 1)) {
                        case 'w':
                            number += 2;
                            index += 3;
                            break;
                        case 'h':
                            number += 3;
                            index += 5;
                            break;
                    }

                    break;
                case 'f':
                    switch (numbers.charAt(index + 1)) {
                        case 'o':
                            number += 4;
                            index += 4;
                            break;
                        case 'i':
                            number += 5;
                            index += 4;
                            break;
                    }

                    break;
                case 's':
                    switch (numbers.charAt(index + 1)) {
                        case 'i':
                            number += 6;
                            index += 3;
                            break;
                        case 'e':
                            number += 7;
                            index += 5;
                            break;
                    }

                    break;
                case 'e':
                    number += 8;
                    index += 5;
                    break;
                case 'n':
                    number += 9;
                    index += 4;
                    break;
            }
        }

        return number;
    }
}
