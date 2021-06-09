package HumanAndHouse;
// class nhà ; kế thừa class dịch vụ
public class House  extends Service{
    private String standardRoom ;// phòng loại thường
    private String convenient; // tiện ích
    private int numberFloor; // số tầng

    public House() {
    }

    public House(String id, String nameService, int areaUsed, int rentCosts, int maxPeople, String renType, String standardRoom, String convenient, int numberFloor) {
        super(id, nameService, areaUsed, rentCosts, maxPeople, renType);
        this.standardRoom = standardRoom;
        this.convenient = convenient;
        this.numberFloor = numberFloor;
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

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", numberFloor=" + numberFloor +
                '}' +super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
