public class Task3 {
    private int[][] array;
    private int[][] result;

    public Task3(int[][] array) {
        this.array = array;
        result = new int[array.length + 1][array[0].length + 1];
    }

    public void method1() {
        int rows = array.length;
        int cols = array[0].length;

        System.out.println("Початковий масив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = array[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate row sums and column sums in a single loop
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += array[i][j];
                result[rows][j] += array[i][j]; // Accumulate column sums
            }
            result[i][cols] = rowSum;
        }

        System.out.println("Змiнений масив:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (result[rows][i] == result[j][cols]) {
                    System.out.println("Однакова сума елементiв i стовпцiв: " + result[rows][i] + "["
                            + j + "] [" + i + "]");
                }
            }
        }
    }
}