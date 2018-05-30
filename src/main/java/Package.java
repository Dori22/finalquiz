import java.util.Date;

public class Package {

    private String targetLocation;
    private double distance;
    private double merchandiseValue;
    private Date deliveryDate;

    public Package(String targetLocation, double distance, double merchandiseValue, Date deliveryDate) {
        this.targetLocation = targetLocation;
        this.distance = distance;
        this.merchandiseValue = merchandiseValue;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public double getDistance() {
        return distance;
    }

    public double getMerchandiseValue() {
        return merchandiseValue;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public double calculateProfit(double pricePerKM) {
        return pricePerKM * distance;
    }

    @Override
    public String toString() {
        return "Date "+ deliveryDate+ " Location "+ targetLocation;
    }
}



