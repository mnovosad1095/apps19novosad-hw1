package ua.edu.ucu.tempseries;

public class TemperatureSeriesAnalysis {

    private double[] temperatureSeries;

    public TemperatureSeriesAnalysis() {

    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.temperatureSeries = temperatureSeries;
    }

    public double average() {
        double sum = 0;

        for (double d : temperatureSeries) {
            sum += d;
        }

        return sum / (double) temperatureSeries.length;
    }

    public double deviation() {
        double avg = average();
        double variation = 0;
        
        for (double d : temperatureSeries) {
            variation += Math.pow((d - avg), 2);
        }

        return Math.sqrt((variation/(double) temperatureSeries.length));
    }

    public double min() {
        double min = temperatureSeries[0];
        int len = temperatureSeries.length;

        for ( int i = 1; i < len; i++ ){
            if (temperatureSeries[i] < min) {
                min = temperatureSeries[i];
            }
        }

        return min;
    }

    public double max() {
        double max = temperatureSeries[0];
        int len = temperatureSeries.length;

        for ( int i = 1; i < len; i++ ){
            if (temperatureSeries[i] > max) {
                max = temperatureSeries[i];
            }
        }

        return max;
    }

    public double findTempClosestToZero() {
        return 0;
    }

    public double findTempClosestToValue(double tempValue) {
        return 0;
    }

    public double[] findTempsLessThen(double tempValue) {
        return null;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        return null;
    }

    public TempSummaryStatistics summaryStatistics() {
        return null;
    }

    public int addTemps(double... temps) {
        return 0;
    }
}
