package java1.lessonsforqa.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 55;
        System.out.println("Сумма положительная");

    }

    public static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 || value <= 100)
        {
            System.out.println("Желтый");
        }
        if (value < 100)
        {
            System.out.println("Зеленый");

        }
    }

    private static void compareNumbers() {
        int a = 10;
        int b = 25;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");

        }
    }
