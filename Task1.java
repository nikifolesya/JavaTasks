class Task1 {
    public static void main(String[] args) {
        System.out.println("-----------№1-----------");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
        System.out.println("-----------№2-----------");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
        System.out.println("-----------№3-----------");
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
        System.out.println("-----------№4-----------");
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
        System.out.println("-----------№5-----------");
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
        System.out.println("-----------№6-----------");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\')); 
        System.out.println("-----------№7-----------");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
        System.out.println("-----------№8-----------");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
        System.out.println("-----------№9-----------");
        System.out.println(sumOfCubes(new int[] {1, 5, 9}));
        System.out.println(sumOfCubes(new int[] {3, 4, 5}));
        System.out.println(sumOfCubes(new int[] {2}));
        System.out.println(sumOfCubes(new int[] {}));
        System.out.println("-----------№10-----------");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }
    public static int remainder(int a, int b) {
        return a % b;
    }
    public static int triArea(int a, int b) {
        return (a * b) / 2;
    }
    public static int animals(int a, int b, int c) {
        return a * 2 + b * 4 + c * 4;
    }
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return (prob * prize) > pay ? true : false;
    }
    public static String operation(int N, int a, int b) {
        String s = "none";
        if (a + b == N) {
            s = "added";
        }
        if (a - b == N || b - a == N) {
            s = "subtracted";
        }
        if (a * b == N) {
            s = "product";
        }
        if (a / b == N || b / a == N) {
            s = "division";
        }

        return s;
    } 
    public static int ctoa(char c) {
        return (int) c;
    }
    public static int addUpTo(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i; 
        }
        return sum;
    }    
    public static int nextEdge(int a, int b) {
        return (a + b) - 1;  // c < a + b
    } 
    public static int sumOfCubes(int [] newArray) {
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i] * newArray[i] * newArray[i];
        }
        return sum;
    } 
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 1; i <= b; i++) {
            a = a + a;
        }
        return a % c == 0 ? true : false;
    }
}