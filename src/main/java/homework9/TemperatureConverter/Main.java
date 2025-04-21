package homework9.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
       TemperatureConverter tempaaa = new TemperatureConverter(30);

       double convertationToC = tempaaa.toCelsius();
        double convertationToF = tempaaa.toFahrenheit();

        System.out.println(
                "Цельсии: " + convertationToC + "\n" +
                        "Фаренгейты: " + convertationToF
        );
    }
}
