import java.util.List;

public class PackageTread extends Thread {


    private CollectionPackage cp;
    private BookKeeping bk;

    public PackageTread(CollectionPackage cp, BookKeeping bk) {
        this.cp = cp;
        this.bk = bk;
    }

    @Override
    public void run() {
        List<Package> filteredList = cp.getFilteredList();
        System.out.println("Delivering packages to:  "+filteredList.get(0).getTargetLocation());
        double profit = 0;
        double merchandise = 0;
        for (Package aPackage : filteredList) {
            profit = profit + aPackage.calculateProfit(10);
            merchandise = merchandise + aPackage.getMerchandiseValue();
        }

        try {
            sleep((long)filteredList.get(0).getDistance()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bk.addMerchandise(merchandise);
        bk.addProfit(profit);

    }


}
