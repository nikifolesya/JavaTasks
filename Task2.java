//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("-----------№1-----------");
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));
        System.out.println("-----------№2-----------");
        System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[] {44, 32, 86, 19}));
        System.out.println("-----------№3-----------");
        System.out.println(isAvgWhole(new int[] {1, 3}));
        System.out.println(isAvgWhole(new int[] {1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[] {1, 5, 6}));
        System.out.println(isAvgWhole(new int[] {1, 1, 1}));
        System.out.println(isAvgWhole(new int[] {9, 2, 2, 5}));
        System.out.println("-----------№4-----------");
        System.out.println(cumulativeSum(new int[] {1, 2, 3}));
        System.out.println(cumulativeSum(new int[] {1, -2, 3}));
        System.out.println(cumulativeSum(new int[] {3, 3, -2, 408, 3, 3}));
        System.out.println("-----------№5-----------");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
        System.out.println("-----------№6-----------");
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));
        System.out.println("-----------№7-----------");
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
        System.out.println("-----------№8-----------");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
        System.out.println("-----------№9-----------");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
        System.out.println("-----------№10-----------");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
    }
    public static  String repeat(String word, int n) {
        String result = "";
        for (int i = 0; i < word.length(); i++ ) {
            char letter = word.charAt(i);
            String s = Character.toString(letter);
            for (int j = 0; j < n; j++ ) {
                result = result + s;
            }
        }
        return result;
    }
    public static int differenceMaxMin(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        return max - min;
    }
    public static boolean isAvgWhole(int[] newArray) {
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }
        return sum % newArray.length == 0 ? true : false;
    }
    public static String cumulativeSum(int[] newArray) {
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = newArray[i] + newArray[i-1];
        }
        return Arrays.toString(newArray);
    }
    public static int getDecimalPlaces(String s) {
        String[] arr = s.split("\\.");
        String n = "";
        for (int i = 0; i < arr.length; i++) {
            n = arr[i];
        }
        if (arr.length >= 2) {
            return n.length();
        }
        else {
            return 0;
        }
    }
    public static int Fibonacci(int x) {
        int[] arr = new int[x+2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[arr.length-1];
    }
    public static boolean isValid(String index) {
        return (index.length() == 5) ? index.matches("[\\d]+") : false;
    }
    public static boolean isStrangePair(String a, String b) {
        if (a != "" && b != "") {
            return (a.charAt(0) == b.charAt(b.length()-1) && b.charAt(0) == a.charAt(a.length()-1)) ? true : false;
        }
        else if (a == "" && b == "") {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isPrefix(String word, String prefix) {
        String a = prefix.substring(0, prefix.length()-1);
        String b = word.substring(0, a.length());
        return (b.equals(a)) ? true : false;
    }
    public static boolean isSuffix(String word, String suffix) {
        String a = suffix.substring(1, suffix.length());
        String b = word.substring(word.length() - a.length(), word.length());
        return (b.equals(a)) ? true : false;
    }
    public static int boxSeq(int x) {
        int s = 0;
        if (x == 0) {
            s = 0;
        }
        else if (x > 0 && x % 2 == 0) {
            s = x;
        }
        else {
            s = x + 2;
        }
        return s;
    }
}
