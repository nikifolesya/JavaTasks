//import java.util.Arrays;
//import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*
        System.out.println("-----------№1-----------");
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));
        System.out.println(solutions(0, 1, 1));
        System.out.println("-----------№2-----------");
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
        */
        System.out.println("-----------№3-----------");
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("getColor"));
        System.out.println("-----------№4-----------");
        System.out.println(overTime(new double [] {9, 17, 30, 1.5}));
        System.out.println(overTime(new double [] {16, 18, 30, 1.8}));
        System.out.println(overTime(new double [] {13.25, 15, 30, 1.5}));
        System.out.println("-----------№5-----------");
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));
        System.out.println("-----------№6-----------");
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));
        
        /*
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
        */
    }
    //разбиение строки
    /*public static String essay(int n, int k, String s) {
        String arr[] = s.split(" ");
        String str = new String();
        for (int i = 1; i <= n; i++) {
            str += arr[i-1];
            if (str.length() <= k) { 
                System.out.println( arr[i-1] + " " + arr[i]);
            }
            else System.out.println(arr[i-1]);
            
        }
        return "";
        
        
        
    }*/

    //змея и верблюд
    public static String toCamelCase(String str) {
        String arr[] = str.split("_");
        String s = arr[0];
        for (int i = 1; i < arr.length; i++) {
            s += ((arr[i]).substring(0, 1)).toUpperCase() + (arr[i]).substring(1);
        }
        return s;
        
    }
    public static String toSnakeCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return (str.substring(0,str.indexOf(str.charAt(i))) + "_"
                 + (str.substring(str.indexOf(str.charAt(i)))).toLowerCase());
            }
            
        }
        return "";

    }

    //зарплата за день
    public static String overTime(double arr[]) {
        double start = arr[0];
        double end = arr[1];
        double sal = arr[2];
        double extra = arr[3];
        if (end <= 17) {
            return "$" + Double.toString((Math.ceil((end - start) * sal * 100) / 100));
        }
        else return "$" + Double.toString((Math.ceil(((17 - start) * sal + (end - 17) * sal * extra) * 100) / 100));
    }

    //индекс массы тела
    public static String BMI(String weight, String height) {
        double w, h;
        if (weight.contains("pounds")) {
            w = Double.parseDouble(weight.substring(0, weight.indexOf(" "))) / 2.2046;
        }
        else {
            w = Double.parseDouble(weight.substring(0, weight.indexOf(" ")));
        }
        if (height.contains("inches")) {
            h = Double.parseDouble(height.substring(0, height.indexOf(" "))) * 0.0254;
        }
        else {
            h = Double.parseDouble(height.substring(0, height.indexOf(" ")));
        }
        double imt = Math.ceil(w/(h*h) * Math.pow(10, 1)) / Math.pow(10, 1);
        if (imt < 18.5) {
            return Double.toString(imt) + " Underweight";
        }
        if (imt >= 25) {
            return Double.toString(imt) + " Overweight";
        }
        else return Double.toString(imt) + " Normal weight";

    }

    //кол-во умножений до одноцифрового числа
    public static int bugger(int n) {
        int x = n;
        int k = 0;
        while (x > 9) {
            x = 1;
            while (n > 0) {
                x *= n % 10;
                n = n / 10;
            }
            k+=1;
            n = x;
        }
        return k;
    }


}
