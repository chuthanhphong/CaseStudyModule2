package HumanAndHouse;
// class phòng kế thừa class service
public class Room extends Service {
    private ExtraService extraService;
    public Room() {
    }

    public Room(String id, String nameService, int areaUsed, int rentCosts, int maxPeople, String renType, ExtraService extraService) {
        super(id, nameService, areaUsed, rentCosts, maxPeople, renType);
        this.extraService = extraService;
    }

    public ExtraService getExtraService() {
        return extraService;
    }

    public void setExtraService(ExtraService extraService) {
        this.extraService = extraService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "extraService=" + extraService +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
