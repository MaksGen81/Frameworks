package com.regular_expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator{

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void IPAddressValidator(){
        pattern = Pattern.compile(IPADDRESS_PATTERN);
    }

    /**
     * Validate ip address with regular expression
     * @param ip ip address for validation
     * @return true valid ip address, false invalid ip address
     */
    public static boolean validate(final String ip){
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }
    /*
    ^                      #    начало строки
    (                      #    начало группы #1
    [01]?\\d\\d?           #    возможно 3 цифры, первая 0 или 1 которой
                           #    может не быть вообще, вторая любая цифра, третья
                           #    любая цифра которой может не быть вообще
    |                      #    ИЛИ
    2[0-4]\\d              #    начинается с 2, за которым
                           #    идет число в пределах 0-4 и потом любое число
     |                     #    ИЛИ
     25[0-5]               #    начинается с 25, за которым
                           #    идет число в пределах 0-5
     )                     #    конец группы
     \.                    #    потом точка
     ....                  #    потом то же самое ещё 3 раза
     $                     #    конец строки
     */

    public static void main(String[] args) {
        System.out.println(validate(IPADDRESS_PATTERN));
    }
}