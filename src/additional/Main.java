package additional;

import additional.BadExeption;
import additional.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        int oper;

        System.out.println("Введите два числа");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Выберите операцию: 1-сложение, 2 -умножение, 3- вычитание, 4-деление");

        oper = sc.nextInt();
        Calculator calculator = new Calculator();

        switch (oper) {
            case 1:
                System.out.println(calculator.add(num1, num2));
                break;
            case 2:
               System.out.println(calculator.mul(num1, num2));
            break;
            case 3:
                System.out.println(calculator.sub(num1, num2));
                break;
            case 4:
                try {
                    System.out.println(calculator.div(num1, num2));
                    throw new BadExeption();}
                catch (BadExeption exeption){
                    System.out.println("Обработка исключения.");
                }
                break;
        }
    }
}
