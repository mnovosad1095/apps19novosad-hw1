package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    public double avgtemp;
    public double devTemp;
    public double minTemp;
    public double maxTemp;

    protected TempSummaryStatistics(double avg, double dev, double min,
     double max) {
        avgtemp = avg;
        devTemp = dev;
        minTemp = min;
        maxTemp = max;
    }
}
