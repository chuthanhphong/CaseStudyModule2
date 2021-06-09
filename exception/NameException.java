package exception;

public class NameException extends Exception {
    public NameException(){
        System.out.println("Tên bị sai không theo định dạng");
    }
}
