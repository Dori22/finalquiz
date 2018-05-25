import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CollectionPackage {
    private Date date;
    private String location;
    private List<Package> list=new ArrayList<Package>();

    public CollectionPackage(Date date, String location, List<Package> list) {
        this.date = date;
        this.location = location;
        this.list = list;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public List<Package> getList() {
        return list;
    }





}

