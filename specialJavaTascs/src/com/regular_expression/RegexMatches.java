package com.regular_expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatches {

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    public static final String TEXT = "Мне очень нравится Тайланд. Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";

    public static void main( String args[] ) {

        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "Украина"));

        System.out.println(test("pizza"));   //true
        System.out.println(test("@pizza"));  //false
        System.out.println(test("pizza3"));  //false

        GroopTest();
    }
    public static void GroopTest(){
        Pattern p = Pattern.compile("(якороль).+(\\1)");
        Matcher m = p.matcher("регулярные выражения это круто регулярные выражения это круто регулярные выражения это круто " +
                "якороль Я СЕГОДНЯ ЕЛ БАНАНЫ якороль регулярные выражения это круто якороль" );
        if(m.find()){
            System.out.println(m.group());
        }
    }

    public static boolean test(String testString){
        Pattern p = Pattern.compile("^[a-z]+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

    public static void Regexexampl(){
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // get a matcher object
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }
    }
    public static void SplitMethid () {
        String text3 = "Егор Алла Анна";
        Pattern pattern2 = Pattern.compile("\\s");
        String[] strings = pattern2.split(text3, 2);
        for (String s3 : strings) {
            System.out.println(s3);
        }
        System.out.println("---------");
        String[] strings1 = pattern2.split(text3);
        for (String s4 : strings1) {
            System.out.println(s4);
        }

    }



    public static void StartEnd() {
        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("А.+?а");

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start, end) + " с " + start + " по " + (end - 1) + " позицию");
        }
        System.out.println(matcher.replaceFirst("Ира"));
        System.out.println(matcher.replaceAll("Ольга"));
        System.out.println(text);
    }
}