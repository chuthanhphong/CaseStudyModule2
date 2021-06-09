package exception;

public class BirthDayException extends Exception {
    public BirthDayException(){
        System.out.println("Năm sinh sau 1900,tuổi hơn 18 và ngày sinh theo định dạng : dd/mm/yyyy.");
    }
}
