import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("-----------№1-----------");
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
        System.out.println(solutions(0, 1, 1));
        System.out.println("-----------№2-----------");
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
        System.out.println("-----------№3-----------");
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
        System.out.println("-----------№4-----------");
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("Ada"));
        System.out.println(flipEndChars("z"));
        System.out.println("-----------№5-----------");
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("CD5C5C"));
        System.out.println("-----------№6-----------");
        System.out.println(same(new int [] {1, 3, 4, 4, 4}, new int [] {2, 5, 7}));
        System.out.println(same(new int [] {9, 8, 7, 6}, new int [] {4, 4, 3, 1}));
        System.out.println(same(new int [] {2}, new int [] {3, 3, 3, 3, 3}));
        System.out.println("-----------№7-----------");
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(297));
        System.out.println(isKaprekar(0));
        System.out.println(isKaprekar(1));
        System.out.println("-----------№8-----------");
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));
        System.out.println("-----------№9-----------");
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
        System.out.println("-----------№10-----------");
        System.out.println(rightTriangle(3, 4, 5));
        System.out.println(rightTriangle(145, 105, 100));
        System.out.println(rightTriangle(70, 130, 110));
        
    }

    //кол-во решений квадратного уравнения
    public static int solutions(int a, int b, int c) {
        if (a != 0 && (b * b - 4 * a * c) > 0) {
            return 2;
        }
        else if (a == 0 || (b * b - 4 * a * c) == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    //позиция "zip"
    public static int findZip(String s) {
        return (s.indexOf("zip", s.indexOf("zip")+1));
    }

    //совершенное число
    public static boolean checkPerfect(int n) {
        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(n % i == 0) {
                arrayList.add(i);
            }
        }
        for (int j = 0; j < arrayList.size(); j++) {
            sum += arrayList.get(j);
        }
        return (sum == n);   
    }

    //поменять местами 1 и последний символ
    public static String flipEndChars(String str) {
        if (str.length() < 2) {
            return "Incompatible.";
        }
        else if (str.charAt(0) == str.charAt(str.length()-1)) {
            return "Two's a pair.";
        }
        else {
            return str.substring(str.length()-1) + str.substring(1, str.length()-1) + str.substring(0, 1);
        }
    }

    //допустимый 16 код
    public static boolean isValidHexCode(String str) {
        String s = "abcdef1234567890";
        String substr = (str.toLowerCase()).substring(1);
        if (str.charAt(0) == '#' && substr.length() == 6) {
            for (int i = 0; i < substr.length(); i++) {
                if (s.indexOf(substr.charAt(i)) != -1) continue;
                else return false;
            }
        }
        else return false;
        return true;
    }

    //массивы имеют одинаковое кол-во уникальных элементов
    public static boolean same(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum1 = 1;
        int sum2 = 1;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i-1] != arr1[i]) {
                sum1 += 1;
            }
        }
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i-1] != arr2[i]) {
                sum2 += 1;
            }
        }
        return (sum1 == sum2);
    }

    //число Капрекара
    public static boolean isKaprekar(int n) {
        int a, b;
        int sqr = n*n;
        String s = Integer.toString(sqr);
        if (n == 0 || n == 1) {
            return true;
        }
        else if (s.length() > 1 && s.length() % 2 == 0) {
            a = Integer.parseInt(s.substring(0, s.length()/2));
            b = Integer.parseInt(s.substring(s.length()/2, s.length()));
            return (a + b == n);
        }
        else if (s.length() > 1 && s.length() % 2 != 0) {
            a = Integer.parseInt(s.substring(0, (s.length() - 1)/2));
            b = Integer.parseInt(s.substring((s.length() - 1)/2, s.length()));
            return (a + b == n);
        }
        return false;

    }

    //длинная последовательность нулей
    public static String longestZero(String s) {
        if (s.contains("0")) {
            String[] arr = s.split("1");
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
        else return "";
    }

    //простое число
    public static int nextPrime(int n) {
        boolean isPrime = false;
        while (isPrime != true) {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if ((n % i) == 0) {
                    isPrime = false;
                    n++;
                }
                else {
                    isPrime = true;
                }
            }   
        }
        return n;
    }
        


    //ребра прямоугольного треугольника
    public static boolean rightTriangle(int x, int y, int z) {
        if ((x > y && x > z) && x == Math.sqrt(y*y + z*z)) {
            return true;
        }
        else if ((y > x && y > z) && y == Math.sqrt(x*x + z*z)) {
            return true;
        }
        else if ((z > x && z > y) && z == Math.sqrt(x*x + y*y)) {
            return true;
        }
        else return false;
    }

     
}
