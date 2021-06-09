package HumanAndHouse;

public class Person implements Comparable<Person> {
private String fullName ; // tên đầy đủ
    private String dateOfBirth ; // ngày tháng năm sinh
    private String gender; // giới tính
    private String idCard ;// số cmnd
    private String phoneNumber; // số dt
    private String email; // email
    private String typeOfPerson;// loại khách hàng
    private String address ; // địa chỉ khách hàng
    private String service ; // loại dịch vụ

    public Person() {
    }

    public Person(String fullName, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String typeOfPerson, String address, String service) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfPerson = typeOfPerson;
        this.address = address;
        this.service = service;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfPerson() {
        return typeOfPerson;
    }

    public void setTypeOfPerson(String typeOfPerson) {
        this.typeOfPerson = typeOfPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", typeOfPerson='" + typeOfPerson + '\'' +
                ", address='" + address + '\'' +
                ", service='" + service + '\'' +
                '}';
    }
    public void showInfo()// hiển thị thông tin
            {
                System.out.println(this.toString());

    }

    @Override
    public int compareTo(Person second) {
        int result = this.fullName.compareTo(second.fullName);
        if(result==0){
            int yearPersonFirst = Integer.parseInt(this.dateOfBirth.split("/")[2]);
            int yearPersonSecond = Integer.parseInt(second.dateOfBirth.split("/")[2]);
            return yearPersonFirst-yearPersonSecond;
        }
        return result;
    }
}
