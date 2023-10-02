package stringAddCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringCalculator {
    public static int splitAndSum(String str) {
        if (_isEmptyStr(str)) return 0;
        String[] splitString = _doSplit(str);

        return _sum(splitString);
    }

    private static int _sum(String[] splitString) {
        int sum = 0;
        for (String str : splitString) {
            sum += _convertStringToInt(str);
        }
        return sum;
    }

    private static int _convertStringToInt(String str) {
        try {
            int number = Integer.parseInt(str);
            _validate(number);
            return number;
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }

    private static void _validate(int number) {
        if (number < 0) {
            throw new RuntimeException();
        }
    }


    private static String[] _doSplit(String str) {
        Pattern pattern = Pattern.compile("(//)(.*?)(\n)");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()) {
            str = str.substring(matcher.end());
            return str.split("[,;"+matcher.group(2).trim()+"]");

        }
        return str.split("[,:]");
    }

    private static boolean _isEmptyStr(String str) {
        return str == null || str.isEmpty();
    }
}
