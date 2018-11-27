package com.my.lei.test.think_in_java.strings.exercise10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionLearn {


    public static void main(String[] args) {
        String sentence = "Java now has regular expression";
        String[] res = {
                "^Java",
                "\\Breg.*",
                "n.w\\s+h(a|i)s",
                "s?",
                "s*",
                "s+",
                "s{4}",
                "s{1}",
                "s{0,3}"
        };
        for (String re : res) {
            System.out.println("RE="+re);
            Pattern p = Pattern.compile(re);
            Matcher m = p.matcher(sentence);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions" + m.start() + "-" + (m.end() - 1));
            }
        }
    }


}
