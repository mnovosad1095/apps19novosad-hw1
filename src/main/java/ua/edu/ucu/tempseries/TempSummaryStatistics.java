package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    double avgtemp;
    double devTemp;
    double minTemp;
    double maxTemp;

    protected TempSummaryStatistics(double avg, double dev, double min, double max) {
        avgtemp = avg;
        devTemp = dev;
        minTemp = min;
        maxTemp = max;
    }
}
