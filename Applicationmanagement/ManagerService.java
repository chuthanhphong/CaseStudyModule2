package Applicationmanagement;

import GeneralSetting.FileUtil;
import GeneralSetting.Validator;

import java.util.Scanner;

public class ManagerService {
    private static final String EMPLOYEE = "D:\\New folder\\CaseStudyModule2.vs2\\CaseStudyModule2.CTP\\src\\FileData\\Employee";
    private static final String BOOKING = "D:\\New folder\\CaseStudyModule2.vs2\\CaseStudyModule2.CTP\\src\\FileData\\Book";
    private static final String VILLA = "D:\\New folder\\CaseStudyModule2.vs2\\CaseStudyModule2.CTP\\src\\FileData\\Villa";
    private static final String HOUSE = "D:\\New folder\\CaseStudyModule2.vs2\\CaseStudyModule2.CTP\\src\\FileData\\House";
    private static final String ROOM = "D:\\New folder\\CaseStudyModule2.vs2\\CaseStudyModule2.CTP\\src\\FileData\\Room";
    private static final String PERSON = "D:\\New folder\\CaseStudyModule2.vs2\\CaseStudyModule2.CTP\\src\\FileData\\Person";
    public static Scanner scanner = new Scanner(System.in);
    private boolean isExit;
    private boolean isBackMenu;

    public ManagerService() {
    }

    public ManagerService(boolean isExit, boolean isBackMenu) {
        this.isExit = isExit;
        this.isBackMenu = isBackMenu;
    }

    public void addNewServiceMenu() {
        int choice;
        do {
            System.out.println("1.Thuê một biệt thự");
            System.out.println("2.Thuê một căn nhà");
            System.out.println("3.Thuê một phòng");
            System.out.println("4.Trở về Menu");
            System.out.println("5.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    isBackMenu = false;
                    break;
                case 2:
                    isBackMenu = false;
                    break;
                case 3:
                    isBackMenu = false;
                    break;
                case 4:
                    isBackMenu = true;
                    break;
                case 5:
                    isExit = true;
                    break;
                default:

            }
            if (isExit || isBackMenu) {
                return;
            }
        } while (choice >= 0 && choice <= 5);
    }

    public static void addNewservice(String filename) {
        String id;
        do {
            System.out.println("Nhập SeverId của bạn theo định dang YN[VL,RO,HO]");
            id = scanner.nextLine();
        } while (!Validator.isValidRegex(id, Validator.SERVICE_ID_REGEX));
        String nameService;
        do {
            System.out.println("Nhập tên");
            nameService = scanner.nextLine();
        } while (!Validator.isValidRegex(nameService, Validator.SERVICE_NAME_REGEX));
        int areaUse;
        do {
            System.out.println("Nhập diện tích sử dụng");
            areaUse = scanner.nextInt();
        } while (!Validator.isMorethan(areaUse, 30));
        int rentCost;
        do {
            System.out.println("Nhập giá tiền ");
            rentCost = scanner.nextInt();
        } while (!Validator.isMorethan(rentCost, 0));
        int maxpeople;
        do {
            System.out.println("Nhập số người tối đa");
            maxpeople = scanner.nextInt();
        } while (!Validator.isMorethan(maxpeople, 0, 20));

        scanner.nextLine();
        System.out.println("Vui Lòng Nhập Loại cho thuê");
        String rentType = scanner.nextLine();
        FileUtil.setFullPathFile(filename);
        switch (filename) {
            case VILLA: {
                String standardRoom;
                do {
                    System.out.println("Nhập tiêu chuẩn của phòng");
                    standardRoom = scanner.nextLine();
                } while (!Validator.isValidRegex(standardRoom, Validator.SERVICE_NAME_REGEX));
                String convenient;
                do {
                    System.out.println("Nhập tiện lợi bạn muốn chọn");
                    convenient = scanner.nextLine();
                } while (!Validator.isValidRegex(convenient, Validator.SERVICE_NAME_REGEX));
                int areaPool;
                do {
                    System.out.println("Nhập diện tích hồ bơi");
                    areaPool = scanner.nextInt();
                } while (!Validator.isMorethan(areaPool, 30));
                int numberFloor;
                do {
                    System.out.println("Nhập số tầng");
                    numberFloor = scanner.nextInt();
                } while (!Validator.isMorethan(numberFloor, 0));
                FileUtil.writeFile(new String[]{id, nameService, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxpeople), String.valueOf(standardRoom), convenient, String.valueOf(areaPool), String.valueOf(numberFloor)});
                break;
            }
            case HOUSE: {
                String standardRoomHO;
                do {
                    System.out.println("Nhập tiêu chuẩn bạn muốn chọn");
                    standardRoomHO = scanner.nextLine();
                } while (!Validator.isValidRegex(standardRoomHO, Validator.SERVICE_NAME_REGEX));
                String convenientHO;
                do {
                    System.out.println("Nhập tiện lợi bạn muốn");
                    convenientHO = scanner.nextLine();
                } while (!Validator.isValidRegex(convenientHO, Validator.SERVICE_NAME_REGEX));
                int numberFloorHO;
                do {
                    System.out.println("Nhập số tầng bạn muốn");
                    numberFloorHO = scanner.nextInt();
                } while (!Validator.isMorethan(numberFloorHO, 0));
                FileUtil.writeFile(new String[]{id, nameService, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxpeople), rentType, standardRoomHO, convenientHO, String.valueOf(numberFloorHO)});
                break;
            }
            case ROOM: {
                String exServiceName;
                do {
                    System.out.println("Nhập dịch vụ bổ sung");
                    exServiceName = scanner.nextLine();
                } while (!Validator.isValidExtraServiceName(exServiceName));
                System.out.println("Nhập đơn vị");
                String unit = scanner.nextLine();
                System.out.println("Nhập số tiền");
                int money = scanner.nextInt();
                FileUtil.writeFile(new String[]{id, nameService, String.valueOf(areaUse), String.valueOf(rentCost), String.valueOf(maxpeople), rentType, exServiceName, unit, String.valueOf(money)});
                break;
            }
        }
    }
    public void showService(){
        int choice;
        do {
            System.out.println("1.Xem tất cả biệt thự");
            System.out.println("2.Xem tất cả nhà");
            System.out.println("3.Xem tất cả phòng");
            System.out.println("4.Xem tất cả biệt thự không trùng lặp");
            System.out.println("5.Xem tất cả nhà không trùng lặp");
            System.out.println("6.Xem tất cả phòng không trùng lặp");
            System.out.println("7.Trở về Menu");
            System.out.println("8.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice){
                


















            }
        }
    }
}
