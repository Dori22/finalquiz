import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

    private static List<Package> allPackages = new ArrayList<Package>();
    private static Calendar calendar = Calendar.getInstance();
    private static List<CollectionPackage> allCollectionList = new ArrayList<CollectionPackage>();


    public static void main(String[] args) {

        initializedPackages();
//        calendar.set(2018, Calendar.JUNE, 10);
//
//
//        CollectionPackage temp = groupItemsByLocationAndDate(calendar.getTime(), "Alba");
//        List<Package> tempList = temp.getFilteredList();
//        System.out.println(tempList.size());
//
//        for (Package aPackage : tempList) {
//            System.out.println(aPackage);
//
//        }
//
        addAllCollectionPackages();
        System.out.println();

    }


    public static void initializedPackages() {
        calendar.set(2018, Calendar.JUNE, 10);
        Package package1 = new Package("Alba", 20, 500, calendar.getTime());
        allPackages.add(package1);
        package1 = new Package("Alba", 20, 700, calendar.getTime());
        allPackages.add(package1);

        calendar.set(2018, Calendar.JUNE, 15);
        package1 = new Package("Aiud", 25, 250, calendar.getTime());
        allPackages.add(package1);
        package1 = new Package("Aiud", 25, 400, calendar.getTime());
        allPackages.add(package1);

        calendar.set(2018, Calendar.JUNE, 20);
        package1 = new Package("Blaj", 35, 2500, calendar.getTime());
        allPackages.add(package1);
        package1 = new Package("Blaj", 35, 4000, calendar.getTime());
        allPackages.add(package1);

        calendar.set(2018, Calendar.JUNE, 28);
        package1 = new Package("Campia Turzii", 40, 800, calendar.getTime());
        allPackages.add(package1);
        package1 = new Package("Campia Turzii", 40, 350, calendar.getTime());
        allPackages.add(package1);

        calendar.set(2018, Calendar.JUNE, 22);
        package1 = new Package("Tg. Mures", 80, 1000, calendar.getTime());
        allPackages.add(package1);
        package1 = new Package("Tg. Mures", 80, 1350, calendar.getTime());
        allPackages.add(package1);

        calendar.set(2018, Calendar.JUNE, 23);
        package1 = new Package("Sebes", 100, 1200, calendar.getTime());
        allPackages.add(package1);
        package1 = new Package("Sebes", 100, 1450, calendar.getTime());
        allPackages.add(package1);


    }

    public static CollectionPackage groupItemsByLocationAndDate(Date date, String location) {
        List<Package> preliminaryFilteredList = new ArrayList<Package>();
        for (Package aPackage : allPackages) {
            if (date.equals(aPackage.getDeliveryDate()) && location.equals(aPackage.getTargetLocation())) {
                preliminaryFilteredList.add(aPackage);
            }
        }
        CollectionPackage groupedPackages = new CollectionPackage(date, location, preliminaryFilteredList);
        return groupedPackages;
    }

    public static void addAllCollectionPackages() {
        CollectionPackage temp;
        String location;
        Date date;

        for (Package aPackage : allPackages) {
            location = aPackage.getTargetLocation();
            date = aPackage.getDeliveryDate();
            temp = groupItemsByLocationAndDate(date, location);

            boolean foundDuplicate = false;

            for (CollectionPackage collectionPackage : allCollectionList) {
                if (temp.getDate().equals(collectionPackage.getDate()) &&
                        temp.getLocation().equals(collectionPackage.getLocation())) {
                    foundDuplicate = true;
                    break;

                }
            }
if( foundDuplicate==false) {
    allCollectionList.add(temp);
}
        }
    }

}



