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

        checklen();

        for (double d : temperatureSeries) {
            sum += d;
        }

        return sum / (double) temperatureSeries.length;
    }

    public double deviation() {
        double avg = average();
        double variation = 0;

        checklen();

        for (double d : temperatureSeries) {
            variation += (d - avg) * (d - avg);
        }

        return Math.sqrt(variation / (double) temperatureSeries.length);
    }

    public double min() {
        double min = temperatureSeries[0];
        int len = temperatureSeries.length;

        checklen();

        for (int i = 1; i < len; i++) {
            if (temperatureSeries[i] < min) {
                min = temperatureSeries[i];
            }
        }

        return min;
    }

    public double max() {
        double max = temperatureSeries[0];
        int len = temperatureSeries.length;

        checklen();

        for (int i = 1; i < len; i++) {
            if (temperatureSeries[i] > max) {
                max = temperatureSeries[i];
            }
        }

        return max;
    }

    public double findTempClosestToZero() {
        checklen();

        return findTempClosestToValue(0);
    }

    public double findTempClosestToValue(double tempValue) {
        double minDistance = Math.abs(temperatureSeries[0] - tempValue);
        double distance;
        int len = temperatureSeries.length;

        checklen();

        for (int i = 1; i < len; i++) {
            distance = Math.abs(temperatureSeries[i] - tempValue);
            if (distance <= minDistance && temperatureSeries[i] == minDistance) {
                minDistance = temperatureSeries[i];
            }

        }

        return minDistance;
    }

    public double[] findTempsLessThen(double tempValue) {
        double[] values = new double[temperatureSeries.length];
        int i = 0;

        checklen();

        for (double d : temperatureSeries) {
            if (d < tempValue) {
                values[i] = d;
                i++;
            }
        }

        return values;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        double[] values = new double[temperatureSeries.length];
        int i = 0;

        checklen();

        for (double d : temperatureSeries) {
            if (d > tempValue) {
                values[i] = d;
                i++;
            }
        }

        return values;
    }

    public TempSummaryStatistics summaryStatistics() {
        checklen();
        final TempSummaryStatistics summary = new TempSummaryStatistics(
            average(), deviation(), min(), max());

        return summary;
    }

    public int addTemps(double... temps) {
        return 0;
    }

    private void checklen() {
        if (temperatureSeries.length == 0) {
            throw new IllegalArgumentException();
        }
    }
}
