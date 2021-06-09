package exception;

public class EmailException extends Exception {
    public EmailException(){
        System.out.println("Email của bạn không đúng định dang .Nhập theo định dang abc@abc.abc");
    }
}
