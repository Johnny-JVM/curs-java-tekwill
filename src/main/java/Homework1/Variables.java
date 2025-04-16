package Homework1;

public class Variables {
    public static void main(String[] args) {
        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        String FirstLetterInAlphabet = "A";
        Boolean JavaIsAmazing = ( CurrentWorldPopulation > CarsProducedThisYear );
        double Pi = 3.14159;

        System.out.println(
                CurrentWorldPopulation + "\n" +
                CarsProducedThisYear + "\n" +
                FirstLetterInAlphabet + "\n" +
                JavaIsAmazing + "\n" +
                Pi
        );
    }
}
