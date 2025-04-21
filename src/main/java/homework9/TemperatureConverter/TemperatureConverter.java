package homework9.TemperatureConverter;

public class TemperatureConverter {
    double temp;
    public TemperatureConverter(double r){
        temp = r;
    }

    public double toCelsius() {
        return temp - 32 / 1.8;
    }
public double toFahrenheit(){
        return temp * 1.8 + 32;
}


}
