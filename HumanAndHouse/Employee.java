package HumanAndHouse;

public class Employee {
    private String employeeId ; // mã nhân viên
    private String employeeName; // tên nhân viên
    private String employeeDateOfBirth; // Ngày tháng sinh nhân viên
    private String employeeAddress; // địa chỉ nhân viên

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String employeeDateOfBirth, String employeeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDateOfBirth = employeeDateOfBirth;
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        this.employeeDateOfBirth = employeeDateOfBirth;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDateOfBirth='" + employeeDateOfBirth + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                '}';
    }
}
