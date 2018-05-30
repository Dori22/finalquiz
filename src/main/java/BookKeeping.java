public class BookKeeping {

    private double totalProfit;
    private double totalMerchandise;

    public BookKeeping() {
        this.totalProfit =0;
        this.totalMerchandise = 0;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public double getTotalMerchandise() {
        return totalMerchandise;
    }

    public void addProfit(double profit){
        totalProfit += profit;
    }

    public void addMerchandise(double merchandise){
        totalMerchandise+=merchandise;
    }
}
