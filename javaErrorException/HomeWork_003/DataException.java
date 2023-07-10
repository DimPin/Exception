package javaErrorException.HomeWork_003;

public class DataException extends Exception {
    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Это неправельный формат: %s", i);
        System.out.println();
    }
}