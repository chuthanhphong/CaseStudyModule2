package HumanAndHouse;

public abstract class Service {
    protected String id;// mã phòng
    protected String nameService; // tên dịch vụ
    protected int areaUsed ; // diện tích sử dụng
    protected int rentCosts ;// mã thuê phòng
    protected int maxPeople ; // số người tối đa
    protected String rentype; // loại hình cho thuê

    public Service() {
    }

    public Service(String id, String nameService, int areaUsed, int rentCosts, int maxPeople, String renType) {
        this.id = id;
        this.nameService = nameService;
        this.areaUsed = areaUsed;
        this.rentCosts = rentCosts;
        this.maxPeople = maxPeople;
        this.rentype = renType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(int areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentCosts() {
        return rentCosts;
    }

    public void setRentCosts(int rentCosts) {
        this.rentCosts = rentCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentype() {
        return rentype;
    }

    public void setRentype(String rentype) {
        this.rentype = rentype;
    }
    public abstract void showInfo();

    @Override
    public String toString() {
        return "Service{" +
                "id='" + id + '\'' +
                ", nameService='" + nameService + '\'' +
                ", areaUsed=" + areaUsed +
                ", rentCosts=" + rentCosts +
                ", maxPeople=" + maxPeople +
                ", renType='" + rentype + '\'' +
                '}';
    }
}
