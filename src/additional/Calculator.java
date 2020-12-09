package additional;

public class Calculator {

    public double num1;
    public double num2;


    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int div(int num1, int num2) {

        try {
            return num1 / num2;
        }
        catch (ArithmeticException e) {
            System.out.println("Обработка исключения");
            System.out.println(e.getMessage());
        }

        return -1;
    }
}