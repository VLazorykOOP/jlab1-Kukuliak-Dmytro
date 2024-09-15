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

        }
        System.out.println("Завдання №4:");
        String text = "In a distant galaxy, far beyond the reach of ordinary humans, there existed a planet named Alphabeta. This planet was unique in many ways, but most notably, it was home to a peculiar phenomenon. On Alphabeta, certain words were always arranged in alphabetical order. The inhabitants of this planet, known as Alphabians, took great pride in their linguistic heritage.Every day, the Alphabians would gather in the central square of their capital city, Lexiconia, to celebrate their love for words. They would recite poems, tell stories, and engage in lively debates, all while ensuring that their language remained pure and orderly. Words like abcde, ace, bde, efg, ghij, klm, mnop, qrst, uvw, and xyz were commonly used and cherished.One day, a young Alphabian named Zyx decided to embark on a journey to explore the far reaches of their planet. Zyx was fascinated by the idea of discovering new words and expanding their vocabulary. As Zyx traveled through the lush forests and towering mountains of Alphabeta, they encountered many new and wondrous sights. In the heart of the forest, Zyx stumbled upon an ancient library filled with books that contained words from long-forgotten languages. Zyx spent days poring over these texts, marveling at the beauty and complexity of the words they found. Among the many treasures in the library, Zyx discovered a book that contained a prophecy about a great linguistic revolution. According to the prophecy, a time would come when the Alphabians would need to embrace new words and ideas to ensure the survival of their language. Inspired by this revelation, Zyx returned to Lexiconia with a newfound sense of purpose. Zyx shared the prophecy with the other Alphabians, who were initially skeptical but eventually came to understand the importance of evolving their language.Together, the Alphabians began to incorporate new words into their vocabulary, blending the old with the new in a harmonious and orderly manner. They continued to cherish their linguistic heritage while also embracing the changes that would ensure the longevity of their language. And so, the Alphabians thrived, their love for words and their commitment to linguistic purity guiding them into a bright and prosperous future.";

        Task4 task4 = new Task4(text);
        task4.method1();
        console.close();

    }

}