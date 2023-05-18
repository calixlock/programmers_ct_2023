package com.ll.level0.p181906;

public class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int count = 0;
            if (my_string.length() >= is_prefix.length())
                for (int i = 0; i < is_prefix.length(); i++) {
                    if (is_prefix.charAt(i) == my_string.charAt(i)) {
                        count++;
                    }
                }
            if (count == is_prefix.length()) {
                answer = 1;
            }
        return answer;
    }
    public int solution2(String my_string, String is_prefix){
        if (my_string.startsWith(is_prefix)) return 1;
        return 0;
    }
    public int solution3(String my_string, String is_prefix{
        int k = 0;
        String[] arr = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.substring(0,k);
            k++;
        }
//        for (String str : arr) { if(is_prefix.equals(str)) return 1; } return 0;
        for (int i = 0; i < arr.length; i++) { if(arr[i].equals(is_prefix)) return 1;} return 0;
        }

    public int solution4(String my_string, String is_prefix){
        int answer = 0;
        answer = (my_string.indexOf(is_prefix) == 0) ? 1 : 0;
        return answer;
    }
}
