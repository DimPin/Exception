package javaErrorException.HomeWork_003;

public class DataException extends Exception {
    public void dataException(String str) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Это неправельный формат: %s", str);
        System.out.println();
    }
}