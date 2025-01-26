package p120xxx.p120823;

// 제목 : 직각삼각형 출력하기

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int count = 1; count <= n; count++) {
            sb.append("*".repeat(count)).append("\n");
        }

        System.out.print(sb);
    }
}
