package java1.lessonsforqa.lesson2;

public class lesson2 {
    static int x = 10;
    static int y = 2;
    public static void main(String[] args){

        int sum = add(x,y);


        System.out.println("Sum of x and y " + sum);
        System.out.println("Sum of x and y " + subtract (x,y));
        System.out.println("Sum of x and y " + multiply (x,y));
        System.out.println("Sum of x and y " + divide (x,y));
    }
    public  static int add(int a, int b){
        return a + b;
    }
    public  static int subtract(int a, int b) {
        return a - b;
    }
    public  static int multiply(int a, int b) {
        return a * b;
    }
    public  static int divide(int a, int b) {
        return a / b;
    }

}

