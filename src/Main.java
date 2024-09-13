// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введіть два числа: а та b: ");
        int a = console.nextInt();
        int b = console.nextInt();
        
        // Create an instance of Task1
        Task1 task = new Task1();
        
        // Call all three methods and display results
        System.out.println("Method 1 result: " + task.method1(a, b));
        System.out.println("Method 2 result: " + task.method2(a, b));
        System.out.println("Method 3 result: " + task.method3(a, b));
        
        console.close();
    }
}
