package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        Worker nameTemp = new Worker();

        String pname;
        String prof;
        int year;
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < workers.length; i++) {

                System.out.println("Введите фамилию работника");
                pname = scanner.next();

                System.out.println("Введите название занимаемой должности");
                prof = scanner.next();

                System.out.println("Введите год поступления на работу");
                year = scanner.nextInt();

                workers[i] = new Worker(pname, prof, year);
            }

        }
        catch (Exception e) {
            System.out.println("Неверный формат данных");
            //System.out.println(e.getMessage());
            System.exit(-1);
        }

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].toString());

        }
        System.out.println("Сортировка по фамилии");
        for (int i = 0; i < workers.length; i++) {
            for (int j = 0; j < workers.length -1; j++) {

                if (workers[j].getWorkerName().charAt(0) > workers[j+1].getWorkerName().charAt(0)) {
                    nameTemp = workers[j];
                    workers[j]= workers[j+1];
                    workers[j+1] = nameTemp;
                }
            }
        }

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].toString());

        }

        int workYear = 5;
        System.out.println("Работают больше " + workYear + " лет");
        for (int i = 0; i < workers.length; i++) {

            if (workers[i].getYear() > workYear) {
                System.out.println(workers[i].toString());

            }
        }

    }
}