package ch1.fundamental;

/**
 * Improve the average method so that it is called with at least one parameter
 */
public class Task16 {

    public static double average(double value, double... values) {
        double sum = value;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / values.length;
    }

    /*
        public static double average(double... values) {
            double sum = 0;
            for (double v : values) sum += v;
            return values.length == 0 ? 0 : sum / values.length;
        }
    */
}
