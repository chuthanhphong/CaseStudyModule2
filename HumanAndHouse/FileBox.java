package HumanAndHouse;

import GeneralSetting.FileUtil;
import GeneralSetting.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FileBox {
    public static Scanner scanner = new Scanner(System.in);
    private static final String EMPLOYEE ="employee";

    public static List<Employee> readAllPerson(String filename){
        FileUtil.setFullPathFile(filename);
        List<Employee> listofEmployee = new ArrayList<>();
        List<String> propertiesEmployee = FileUtil.readFile();
        String[] arrPropertyEmployee ;
        Employee employee;

        for(String properties :propertiesEmployee ){
            arrPropertyEmployee = properties.split(StringUtils.COMMA);
            employee = new Employee();
            employee.setEmployeeId(arrPropertyEmployee[0]);
            employee.setEmployeeName(arrPropertyEmployee[1]);
            employee.setEmployeeDateOfBirth(arrPropertyEmployee[2]);
            employee.setEmployeeAddress(arrPropertyEmployee[3]);
            listofEmployee.add(employee);
        }
        return listofEmployee;
    }
    public static void searchEmployee(String filename){
        FileUtil.setFullPathFile(filename);
        List<Employee> employeeList = readAllPerson(EMPLOYEE);
        Stack<Employee> employeeStack = new Stack<>();
        for(Employee employee:employeeList){
            employeeStack.push(employee);
        }
        System.out.println("Nhập số chứng minh nhân dân của bạn : ");
        String employeeId = scanner.nextLine();
        while (!employeeStack.isEmpty()){
            Employee employeeTemp = employeeStack.pop();
            if(employeeTemp.getEmployeeId().equals(employeeId)){
                System.out.println(employeeTemp);
            }
        }
    }

    public static void main(String[] args) {
        FileBox.searchEmployee(EMPLOYEE);
    }

}