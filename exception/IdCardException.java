package exception;

public class IdCardException extends Exception {
    public IdCardException(){
        System.out.println("Số chứng minh của bạn không nhập đúng định dang - Nhập theo định đang 9 chữ số XXX XXX XXX");
    }
}
