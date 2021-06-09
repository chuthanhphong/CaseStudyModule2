package GeneralSetting;

import commons.Validators;
import exception.*;

import java.time.Year;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static final String SERVICE_ID_REGEX = "SV(VL|HO|RO)-[\\d]{4}"; /// SVVL - 1234;
    public static final String SERVICE_NAME_REGEX = "[A-Z][a-z]*"; // Abc;
    public static final String ID_CARD_REGEX = "[\\d]{3} [\\d]{3} [\\d]{3}"; // 123 123 123 ;
    public static final String DATE_REGEX = "[\\d]{2}/[\\d]{2}/[\\d]{4}"; // 01/01/2021;
    public static Pattern pattern;
    public static Matcher matcher;

    public static boolean isValidRegex(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Nhập Mã Regex " + regex);
        }

        return flag;
    }

    public static boolean isMorethan(int number, int destNumber) {
        boolean flag = number > destNumber;
        if (!flag) {
            System.out.println("Số nhập vào không nhiều hơn " + destNumber);
        }
        return flag;
    }


    public static boolean isMorethan(int number, int startnumber, int endnumber) {
        boolean flag = number > startnumber && number < endnumber;

        if (!flag) {
            System.out.println("Số nhập vào không có trong (" + startnumber + ", " + endnumber + " ) ");
        }
        return flag;
    }

    public static void isValiFullName(String fullname) throws NameException {
        String[] fullnameElement = fullname.split(" ");
        for (String element : fullnameElement) {
            if (Character.isLowerCase(element.charAt(0))) {
                throw new NameException();
            }
        }
        for (int i = 0; i < fullname.length() - 1; i++) {
            if (fullname.charAt(i) == ' ' && fullname.charAt(i + 1) == ' ') {
                throw new NameException();
            }
        }
    }

    public static boolean isValidExtraServiceName(String extraservicename) {

        String[] name = {"Spa", "Meetingroom", "launder", "Car", "Golf&&Tenis", "Casino"};

        boolean flag = Arrays.asList(name).contains(extraservicename);

        if (!flag) {
            System.out.println("Các dịch vụ không có trong danh sách dịch vụ");
        }
        return flag;
    }

    public static void isValidEmail(String email) throws EmailException {

        int positionA = email.indexOf("@");
        if (positionA < 0) {
            throw new EmailException();
        }
        int countA = 0;

        int countB = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                countA++;
            } else if (email.charAt(i) == '.') {
                countB++;
            }
        }
        if (countA > 1) {
            throw new EmailException();
        }
        if (countB > 1) {
            throw new EmailException();
        }
    }

    public static void isValidGender(String gender) throws GenderException {

        String[] listGender = {"Nam", "Nữ", "Không xác định"};

        if (!Arrays.asList(listGender).contains(gender.toLowerCase())) {
            throw new GenderException();

        }
    }

    public static void isValidBirthDay(String birthDay) throws BirthDayException {

        if (isValidRegex(birthDay, Validators.DATE_REGEX)) {

            int birthyear = Integer.parseInt(birthDay.split("/")[2]);
            int currentyear = Year.now().getValue();

            if (birthyear <= 1950 || currentyear - birthyear < 18) {
                throw new BirthDayException();
            }

        } else {
            throw new BirthDayException();
        }
    }

    public static void isValidIdCard(String card, String idCard) throws IdCardException {
        if (!isValidRegex(idCard, Validators.ID_CARD_REGEX)) {
            throw new IdCardException();
        }
    }
}
