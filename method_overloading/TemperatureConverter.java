class TemperatureConverter {

    // Celsius to Fahrenheit
    double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit to Celsius
    double convert(double temp, char type) {
        if(type == 'F' || type == 'f')
            return (temp - 32) * 5/9;
        return temp;
    }

    // Celsius to Kelvin
    double convert(double temp, boolean toKelvin) {
        if(toKelvin)
            return temp + 273.15;
        return temp;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("25°C to Fahrenheit: " + converter.convert(25));
        System.out.println("77°F to Celsius: " + converter.convert(77, 'F'));
        System.out.println("25°C to Kelvin: " + converter.convert(25, true));
    }
}
