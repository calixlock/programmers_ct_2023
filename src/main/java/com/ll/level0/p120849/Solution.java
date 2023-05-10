package com.ll.level0.p120849;

public class Solution {
    public String solution(String my_string){
        String answer = my_string;
        answer = answer.replace("a","")
                .replace("e","")
                .replace("i","")
                .replace("o","")
                .replace("u","");
        return answer;
    }
    public String solution2(String my_string){
        return my_string.replaceAll("[aeiou]","");
//        return myString.replaceAll("a|e|i|o|u", "");
    }
    public String solution3(String my_string){
        String[] removeString = new String[]{"a","e","i","o","u"};
        for (String str :
                removeString) {
            my_string = my_string.replace(str,"");
        }
        return my_string;
    }
}
