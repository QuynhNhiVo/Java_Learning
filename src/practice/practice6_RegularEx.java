package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practice6_RegularEx {
    public static void main(String[] args) {
        System.out.println("Regular Expression");
        Pattern pattern = Pattern.compile("^(?!\\d+$)\\w{8,20}$");
        Matcher matcher = pattern.matcher("Tryurcode4u");
        System.out.println("Input String matches regex - "+matcher.matches());

        System.out.println("Personal ID");
        Pattern patternID = Pattern.compile("\\d{12}");
        Matcher matcherID = patternID.matcher("123457856418");
        System.out.println("Persional ID - " + matcherID.matches());

        System.out.println("Password");
        Pattern patternPW = Pattern.compile("\\w{6,}");
        Matcher matcherPW = patternPW.matcher("15ddaa");
        System.out.println("Password - " + matcherPW.matches());

        System.out.println("Email");
        Pattern patternM = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
        Matcher matcherM = patternM.matcher("mial@gmail.com");
        System.out.println("Email - " + matcherM.matches());
    }
}
