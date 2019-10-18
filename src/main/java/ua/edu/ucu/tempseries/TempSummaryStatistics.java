package ua.edu.ucu.tempseries;

public class TempSummaryStatistics {
    public double avgtemp;
    public double devTemp;
    public double minTemp;
    public double maxTemp;

    protected TempSummaryStatistics(double avg, double dev,
     double min,
     double max) {
        avgtemp = avg;
        devTemp = dev;
        minTemp = min;
        maxTemp = max;
    }


    public TempSummaryStatistics() {
    }

    public double getAvgtemp() {
        return this.avgtemp;
    }

    public void setAvgtemp(double avgtemp) {
        this.avgtemp = avgtemp;
    }

    public double getDevTemp() {
        return this.devTemp;
    }

    public void setDevTemp(double devTemp) {
        this.devTemp = devTemp;
    }

    public double getMinTemp() {
        return this.minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return this.maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public TempSummaryStatistics avgtemp(double avgtemp) {
        this.avgtemp = avgtemp;
        return this;
    }

    public TempSummaryStatistics devTemp(double devTemp) {
        this.devTemp = devTemp;
        return this;
    }

    public TempSummaryStatistics minTemp(double minTemp) {
        this.minTemp = minTemp;
        return this;
    }

    public TempSummaryStatistics maxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TempSummaryStatistics)) {
            return false;
        }
        TempSummaryStatistics tempSummaryStatistics = (TempSummaryStatistics) o;
        return avgtemp == tempSummaryStatistics.avgtemp && devTemp == tempSummaryStatistics.devTemp && minTemp == tempSummaryStatistics.minTemp && maxTemp == tempSummaryStatistics.maxTemp;
    }

    @Override
    public String toString() {
        return "{" +
            " avgtemp='" + getAvgtemp() + "'" +
            ", devTemp='" + getDevTemp() + "'" +
            ", minTemp='" + getMinTemp() + "'" +
            ", maxTemp='" + getMaxTemp() + "'" +
            "}";
    }
    
}
