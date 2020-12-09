package task3;

import task2.Worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String productName;
        String shopName;
        int productPrice;


        Price[] prices = new Price[2];
        Price nameTemp = new Price();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {

            System.out.println("Введите название товара");
            productName = scanner.next();

            System.out.println("Введите название магазина");
            shopName = scanner.next();

            System.out.println("Введите стоимость товара");
            productPrice = scanner.nextInt();

            prices[i] = new Price(productName, shopName, productPrice);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i].toString());
        }
            System.out.println("Сортировка по названию магазина");
            for (int i = 0; i < prices.length; i++) {
                for (int j = 0; j < prices.length - 1; j++) {

                    if (prices[j].getShop().charAt(0) > prices[j + 1].getShop().charAt(0)) {
                        nameTemp = prices[j];
                        prices[j] = prices[j + 1];
                        prices[j + 1] = nameTemp;
                    }
                }
            }

            for (int i = 0; i < prices.length; i++) {
                System.out.println(prices[i].toString());
            }
        System.out.println("Введите название магазина");
        shopName = scanner.next();

            try {
                for (int i = 0; i <= prices.length; i++) {
                    if ( shopName.equals(prices[i].getShop()))
                    {
                        System.out.println(prices[i].toString());}
                }
            }
            catch (Exception e){
                System.out.println("Нет такого магазина");
            }
        }
    }