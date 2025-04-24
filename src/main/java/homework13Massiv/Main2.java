package homework13Massiv;

public class Main2 {
    public static void main(String[] args) {

        int[] OneMassiv = {5, 8, 6, 9, 16, 79};
        int[][] Twomassiv = {
                {56, 87, 35, 64},
                {98, 34, 56, 25},
                {45, 89, 14, 38}

        };

        System.out.println("Одномерный  массив-");
        processArray(OneMassiv);

        System.out.println();

        System.out.println("Двухмерный массив-");
        processArray(Twomassiv);

    }

    public static void processArray(int [] array){
        int sum = 0, even = 0, odd = 0;

        for (int num : array) {
            sum += num;
            if(num % 2 == 0) even++;
            else odd++;
        }

        double avg = (double) sum / array.length;

        System.out.println("сумма: " + sum);
        System.out.println("среднее: " + avg);
        System.out.println("чётное: " + even + " нечётное: " + odd);
    }

    public static void processArray(int [] [] array){
        int sum = 0, count = 0, even = 0, odd = 0;

        for (int [] row : array){
            for (int num : row){
                sum += num;
                count++;
                if(num % 2 == 0) even++;
                else odd++;
            }
        }

        double avg = (double) sum / count;

        System.out.println("сумма: " + sum);
        System.out.println("среднее: " + avg);
        System.out.println("чётное: " + even + " нечётное: " + odd);

    }
}
