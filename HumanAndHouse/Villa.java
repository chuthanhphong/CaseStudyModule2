package HumanAndHouse;
// class biệt thự kế thừa class dịch vụ;
public class Villa extends Service {
    private String standardRoom;// phòng loại thường
    private String convenient ; // tiện ích
    private int numberFloor ; // số tầng
    private int areaPool ; // diện tích hồ bơi

    public Villa() {
    }

    public Villa(String id, String nameService, double areaUsed, double rentCosts, int maxPeople, String renType, String standardRoom, String convenient, int numberFloor, int areaPool) {
        super(id, nameService, areaUsed, rentCosts, maxPeople, renType);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.numberFloor = numberFloor;
        this.areaPool = areaPool;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", numberFloor=" + numberFloor +
                ", areaPool=" + areaPool +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
