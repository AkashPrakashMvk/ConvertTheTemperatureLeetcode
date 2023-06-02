class Solution {

    /**
     * Converts a temperature value from Celsius to Kelvin and Fahrenheit.
     *
     * @param celsius The temperature value in Celsius.
     * @return An array containing the converted temperatures in Kelvin and Fahrenheit.
     */
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;                // Convert Celsius to Kelvin
        double fahrenheit = celsius * 1.80 + 32.00;      // Convert Celsius to Fahrenheit
        return new double[]{kelvin, fahrenheit};         // Return the converted temperatures
    }
}