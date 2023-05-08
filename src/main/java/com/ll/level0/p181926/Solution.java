package com.ll.level0.p181926;

import java.util.Arrays;

public class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(control);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.substring(i,i+1).equals("w")) answer += 1;
            else if (sb.substring(i,i+1).equals("s")) answer -= 1;
            else if (sb.substring(i,i+1).equals("d")) answer += 10;
            else if (sb.substring(i,i+1).equals("a")) answer -= 10;
//            System.out.println(sb.substring(i,i+1));
//            System.out.println(answer);
        }
        return answer;
    }
    public int solution2(int n, String control) {
        int answer = 0;
        String[] str_control = control.split("");
//        System.out.println(Arrays.toString(str_control));
        for (String str : str_control) {
            if (str.equals('w')) {answer += 1;}
            else if (str.equals('s')) {answer -= 1;}
            else if (str.equals('d')) {answer += 10;}
            else if (str.equals('a')) {answer -= 10;}
        }
        return answer;
    }
    public int solution3(int n, String control) {
        int answer = n;
        String[] controlList = control.split("");
        for(int i = 0; i<controlList.length; i++){
            if(controlList[i].equals("w")){
                answer+=1;
            }
            else if(controlList[i].equals("s")){
                answer-=1;
            }
            else if(controlList[i].equals("d")){
                answer+=10;
            }
            else if(controlList[i].equals("a")){
                answer-=10;
            }
        }
        return answer;
    }
    public int solution4(int n, String control){
        int answer = n;
        for (char ch : control.toCharArray()){
            switch (ch){
                case 'w': answer += 1; break;
                case 's': answer -= 1; break;
                case 'd': answer += 10; break;
                case 'a': answer -= 10; break;
            }
        }return answer;
    }
    public int solution5(int n, String control){
        for(char ch : control.toCharArray()){
            n += ch == 'w' ? 1 : ch == 's' ? -1 : ch == 'd' ? 10 : ch == 'a'? -10;
        }return n;
    }
}
