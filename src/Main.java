import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Завдання №1:");
        System.out.println("Введiть два числа а та b: ");
        int a = console.nextInt();
        int b = console.nextInt();

        Task1 task1 = new Task1();

        System.out.println("Результат 1 методу: " + task1.method1(a, b));
        System.out.println("Результат 2 методу: " + task1.method2(a, b));
        System.out.println("Результат 3 методу: " + task1.method3(a, b));

        boolean validInput = false;
        int[] x = null;

        while (validInput == false) {
            try {
                System.out.println("Завдання №1:");
                System.out.println("Введiть два числа а та b(a<b): ");
                a = console.nextInt();
                b = console.nextInt();
                System.out.println("Введiть розмір масиву(0<=n<200)): ");
                int n = console.nextInt();

                if (n <= 0 || n > 200) {
                    validInput = false;
                    throw new Exception("n Має належати проміжку [1;200]");
                } else {
                    validInput = true;
                    x = new int[n];
                    for (int i = 0; i < x.length; i++) {
                        x[i] = random.nextInt(100) - 50;
                    }
                }

                if (a > b) {
                    validInput = false;
                    throw new Exception("Число а має бути менше b;");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Помилка: " + e);

            }
        }
        System.out.println("Завдання №2:");
        Task2 task2 = new Task2(a, b, x);

        System.out.println("Результат 1 методу(Sum(x[i],i<a)): " + task2.SumA());
        System.out.println("Результат 2 методу(Multiply(x[i],i>b)): " + task2.dobutB());
        System.out.println("Результат 3 методу(Min(x[i])): " + task2.min());
        System.out.println("Результат 4 методу(Min(x[i])): " + task2.max());

        System.out.println("Завдання №3:");
        validInput = false;
        int[][] y = null;
        while (validInput == false) {
            try {
                System.out.println("Введiть розмір масиву(0<=n<200)): ");
                int n = console.nextInt();
                if (n <= 0 || n > 200) {
                    validInput = false;
                    throw new Exception("n Має належати проміжку [1;200]");
                } else {
                    validInput = true;
                    y = new int[n][n];
                    for (int i = 0; i < y.length; i++) {
                        for (int j = 0; j < y.length; j++) {
                            y[i][j] = random.nextInt(10) - 5;
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Помилка: " + e);
            }

            Task3 task3 = new Task3(y);
            task3.method1();
            console.close();

        }
    }

}