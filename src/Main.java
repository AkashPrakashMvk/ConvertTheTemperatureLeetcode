public class Main {
    public static void main(String[] arg){
        Solution solution = new Solution();
        double[] convertedTemperatures = solution.convertTemperature(36.50);
        System.out.println("Temperature in Kelvin: " + convertedTemperatures[0]);
        System.out.println("Temperature in Fahrenheit: " + convertedTemperatures[1]);
    }
}
