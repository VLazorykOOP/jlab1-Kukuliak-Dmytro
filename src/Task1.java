
public class Task1 {
    
    public double method1(double a, double b) {
        double result= a + ((a + b - 1) / (a * a + 2)) - (int) Math.pow(a * b, 3);
        return result;
    }


    public double method2(int a, int b) {
       double result= a + ((a + b - 1) / (a * a + 2)) -  Math.pow(a * b, 3);
       return result;
    }

    public int method3(double a, double b) {
        int result = (int)(a + ((a + b - 1) / (a * a + 2)) - (int) Math.pow(a * b, 3));
        return result;
    }
}
