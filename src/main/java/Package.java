import java.util.Date;

public class Package implements Comparable<Package>{

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

    public void setTargetLocation(String targetLocation) {
        this.targetLocation = targetLocation;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setMerchandiseValue(double merchandiseValue) {
        this.merchandiseValue = merchandiseValue;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int compareTo(Package o) {
        if(o.deliveryDate <= deliveryDate)








        
    }





}



