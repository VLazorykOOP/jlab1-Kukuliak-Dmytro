public class Task3 {
    private int[][] array;
    private int[][] result;

    public Task3(int[][] array) {
        this.array = array;
        result = new int[array.length + 1][array[0].length + 1];
    }

    public void method1() {
        System.out.println("Початковий масив:");
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                result[i][j] = array[i][j];
                System.out.print(result[i][j] + " ");

            }

            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
            result[i][array[0].length] = sum;
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            result[array.length][i] = sum;
        }
        System.out.println("Змінений масив:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==array[j][i]){
                    System.out.println("Однакова сума елементів і стовпців: "+array[i][j]+"["+i+"] ["+j+"]");
                    
                }
            }
        }
    }

}