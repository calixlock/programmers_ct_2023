package com.ll.level0.p120838;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String letter) {
        String answer= "";
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alphabet = IntStream.range(0, 26)
                .mapToObj(i -> String.valueOf((char) ('a' + i)))
                .toArray(String[]::new);
        LinkedHashMap<String,String> linkmap = new LinkedHashMap<>();
        for (int i = 0; i < morse.length; i++) {
            linkmap.put(morse[i],alphabet[i]);
        }
        String[] arrLetter = letter.split(" ");
        for (int i = 0; i < arrLetter.length; i++) {
            answer += linkmap.get(arrLetter[i]);
        }

        return answer;
    }
    public String solution2(String letter) {
        String answer = "";
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        List<String> morseList  = Arrays.asList(morse);
        String[] arrLetter = letter.split(" ");
        for (int i = 0; i < arrLetter.length; i++) {
            answer += String.valueOf((char) 'a' + morseList.indexOf( arrLetter[i] ) );
        }
        return answer;
    }
}
