package java1.lessonsforqa.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {


    }
    public static boolean within10or20(int a , int b ) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegative(int y) {
        if (y < 0) {
            return true;
        }
        return false;
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < 4; i++) {
            System.out.println("i = " + i);
        }

    }
}

