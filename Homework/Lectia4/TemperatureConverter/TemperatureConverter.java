public class TemperatureConverter {
    public double toCelsius(double x) {
        return (5*(x-32))/9;
    }
    
    public double toFahrenheit(double x) {
        return  (9*x+(32*5))/5;
    }
}
