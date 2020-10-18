package training;

import java.util.StringJoiner;

public class StrJoiner {
    public static void main(String[] args) {
        StringJoiner joi = new StringJoiner("-");
        char[] znaki = {'a', 'b', 'c'};
        joi.add("siema");
        joi.add("siema");
        joi.add("siema");
        joi.add("siema");
        System.out.println(joi);
    }
}
