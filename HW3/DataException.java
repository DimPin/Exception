package HW3;

public class DataException extends Exception {
    public void dataException(String str) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Это неправельный формат: %s\n", str);
    }
}
