package p120xxx.p120818;

// 제목 : 옷가게 할인 받기

class Solution {
    public int solution(int price) {
        return price >= 50_0000 ? (int) (price * 0.8) : price >= 30_0000 ? (int) (price * 0.9)
                : price >= 10_0000 ? (int) (price * 0.95) : price;
    }
}
