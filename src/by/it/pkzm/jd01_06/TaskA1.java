package by.it.pkzm.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        String reg="[а-яА-ЯёЁ]{4,}";
        Pattern pattern = Pattern.compile(reg);
        StringBuilder sb= new StringBuilder(Poem.text);
        Matcher matcher= pattern.matcher(sb);
//        while (matcher.find())
    }
}
