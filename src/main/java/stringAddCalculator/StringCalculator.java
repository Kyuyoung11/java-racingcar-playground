package stringAddCalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class StringCalculator {
    public static int splitAndSum(String str) {
        if (_isEmptyStr(str)) return 0;
        String[] splitString = _makeNumString(str);
        for (String s : splitString) {
            System.out.println("3: "+s);
        }

        return _sum(splitString);
    }

    private static int _sum(String[] splitString) {
        int sum = 0;
        for (String str : splitString) {
            sum+= _convertStringToInt(str);
        }
        return sum;
    }

    private static int _convertStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }

    private static String[] _makeNumString(String str) {
        return str.split(_getDelimiter(str));
    }

    private static String _getDelimiter(String str) {
        try {
            Pattern pattern =Pattern.compile("[//](.*?)[\n]");
            Matcher matcher = pattern.matcher(str);
            System.out.println("1 : "+ matcher.start()+ ", "+ matcher.end()+", "+matcher.regionEnd());
            str = str.substring(5);
            return matcher.group(1).trim();
        } catch (Exception e) {
            return ",|:";
        }
    }

    private static boolean _isEmptyStr(String str) {
        return str == null || str.isEmpty();
    }
}
