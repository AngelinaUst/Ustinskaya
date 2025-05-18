public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        int a = 7;
        int b = 5;
        checkNumbers(a, b);
        number(a);
        numberLogic(a);
        lineNumber("Строчка и точка.", 5);
        int year = 1995;
        leapYear(year);
        changeArray();
        newArray();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = -8;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (0 < value && value < 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }

    public static void compareNumbers() {
        int a = 35;
        int b = 48;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkNumbers(int a, int b) {
        int sum = a + b;
        if (10 <= sum && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void number(int a) {
        if (a >= 0) {
            System.out.println("Полжительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean numberLogic(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void lineNumber(String line, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(line);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void changeArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void newArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }
}