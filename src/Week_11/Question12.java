package Week_11;

/*
    Question: To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by .5556 (or 5/9). To convert temperatures in degrees Celsius to Fahrenheit, multiply by 1.8 (or 9/5) and add 32.
Create a class that can return the current temperature in either Celsius or in Fahrenheit.
Hint: You may choose to save the temperature in one of these scales, and convert to the other scale as necessary.
 */

public class Question12 {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter(0);

        converter.setTemperatureCelsius(20);
        double tempInCelsius = converter.getTemperatureCelsius();
        double tempInFahrenheit = converter.getTemperatureFahrenheit();
        System.out.println("Temperature in Celsius: " + tempInCelsius);
        System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit);

        converter.setTemperatureFahrenheit(68);
        tempInCelsius = converter.getTemperatureCelsius();
        tempInFahrenheit = converter.getTemperatureFahrenheit();
        System.out.println("Temperature in Celsius: " + tempInCelsius);
        System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit);
    }
}
class TemperatureConverter {
    private double temperatureCelsius;

    public TemperatureConverter(double initialTemperatureCelsius) {
        this.temperatureCelsius = initialTemperatureCelsius;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

    public double getTemperatureFahrenheit() {
        return (this.temperatureCelsius * 1.8) + 32;
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperatureCelsius = (temperatureFahrenheit - 32) / 1.8;
    }
}
