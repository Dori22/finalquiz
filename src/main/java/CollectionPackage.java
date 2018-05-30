import java.util.Date;
import java.util.List;


public class CollectionPackage {
    private Date date;
    private String location;
    private List<Package> filteredList;

    public CollectionPackage(Date date, String location, List<Package> filteredList) {
        this.date = date;
        this.location = location;
        this.filteredList =filteredList;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public List<Package> getFilteredList() {
        return filteredList;
    }





}

