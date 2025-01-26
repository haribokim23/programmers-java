package p042xxx.p042888;

// 제목 : 오픈채팅방

import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String[] solution(String[] record) {
        StringTokenizer st;
        HashMap<String, String> hm = new HashMap<>();
        int count = 0;
        String[] message;

        for (String s : record) {
            st = new StringTokenizer(s);
            String action = st.nextToken(), id = st.nextToken(), name = null;

            if (st.hasMoreTokens()) {
                name = st.nextToken();
            }

            switch (action) {
                case "Enter":
                    hm.put(id, name);
                    count++;
                    break;
                case "Change":
                    hm.replace(id, name);
                    break;
                case "Leave":
                    count++;
                    break;
                default:
                    break;
            }
        }

        message = new String[count];
        count = 0;

        for (String s : record) {
            st = new StringTokenizer(s);
            String action = st.nextToken(), id = st.nextToken();

            switch (action) {
                case "Enter":
                    message[count] = hm.get(id) + "님이 들어왔습니다.";
                    count++;
                    break;
                case "Leave":
                    message[count] = hm.get(id) + "님이 나갔습니다.";
                    count++;
                    break;
                default:
                    break;
            }
        }

        return message;
    }
}
