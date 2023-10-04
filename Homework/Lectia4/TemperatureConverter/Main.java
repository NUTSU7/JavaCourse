public class Main {
    public static void main(String[] args) {
        TemperatureConverter tempConv = new TemperatureConverter();

        System.out.println(tempConv.toCelsius(82.4));
        System.out.println(tempConv.toFahrenheit(22.0));
    }
}
