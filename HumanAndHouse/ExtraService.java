package HumanAndHouse;

// class dịch vụ bổ sung
public class ExtraService {
    private String extraServiceName; // tên dịch vụ bổ sung;
    private String unit; // đơn vị
    private int money; // giá tiền

    public ExtraService() {
    }

    public ExtraService(String extraServiceName, String unit, int money) {
        this.extraServiceName = extraServiceName;
        this.unit = unit;
        this.money = money;
    }

    public String getExtraServiceName() {
        return extraServiceName;
    }

    public void setExtraServiceName(String extraServiceName) {
        this.extraServiceName = extraServiceName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ExtraService{" +
                "extraServiceName='" + extraServiceName + '\'' +
                ", unit='" + unit + '\'' +
                ", money=" + money +
                '}';
    }
}
