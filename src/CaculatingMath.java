public class CaculatingMath {

    public static String flourCalNorm (double waterAmount, double hydrationLevel) {
        double flourAmount = ((waterAmount * 100) / hydrationLevel);
        return String.format("The needed flour amount is %.2f ", flourAmount);
    }

    public static String waterCalNorm (double flourAmount, double hydrationLevel) {
        double waterAmount = ((hydrationLevel * flourAmount) / 100);
        return String.format("The needed water amount is %.2f ", waterAmount);
    }

    public static String hydrationCalNorm (double flourAmount, double waterAmount) {
        double hydrationLevel = (waterAmount / flourAmount) * 100;
        return String.format("The hydration level is %.2f%%", hydrationLevel);
    }

    public static String flourCalSour (double waterAmount, double hydrationLevel, double starterAmount) {
        double flourAmount = (((waterAmount + starterAmount / 2) * 100) / hydrationLevel) - (starterAmount / 2);
        return String.format("The needed flour amount is %.2f ", flourAmount);
    }

    public static String waterCalSour (double flourAmount, double hydrationLevel, double starterAmount) {
        double waterAmount = ((hydrationLevel * (flourAmount + starterAmount /2)) / 100) - (starterAmount / 2);
        return String.format("The needed water amount is %.2f ", waterAmount);
    }

    public static String hydrationCalSour (double flourAmount, double waterAmount, double starterAmount) {
        double hydrationLevel = ((waterAmount + starterAmount / 2) / (flourAmount + starterAmount / 2)) * 100;
        return String.format("The hydration level is %.2f%%", hydrationLevel);
    }

    public static String starterCalSour (double flourAmount, double waterAmount, double hydrationLevel) {
        double starterAmount = ((200 * waterAmount - hydrationLevel * 2 * flourAmount) / (hydrationLevel - 100));
        return String.format("The needed starter amount is %.2f ", starterAmount);
    }
}
