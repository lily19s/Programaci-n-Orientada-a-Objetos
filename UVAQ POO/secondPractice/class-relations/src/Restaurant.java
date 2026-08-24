import java.util.ArrayList;

public class Restaurant {

    private String name;
    private String address;
    private ArrayList<Table> tableList;

    public Restaurant(String name, String adress){
        this.name = name;
        this.address = adress;
        this.tableList = new ArrayList<Table>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Table> getTableList() {
        return tableList;
    }
    
    public void addTable(Table newTable){
        
        tableList.add(newTable);
    }

}
