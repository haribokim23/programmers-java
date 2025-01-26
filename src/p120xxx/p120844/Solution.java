package p120xxx.p120844;

// 제목 : 배열 회전시키기

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;

        if (direction.equals("right")) {
            int temp = numbers[length - 1];
            System.arraycopy(numbers, 0, numbers, 1, length - 1);
            numbers[0] = temp;
        } else {
            int temp = numbers[0];
            System.arraycopy(numbers, 1, numbers, 0, length - 1);
            numbers[length - 1] = temp;
        }

        return numbers;
    }
}
