package HW3;

public class GenderException extends Exception {
    public void genderException(String str) {
        System.out.println("Exception: GenderNotCorrectData");
        System.out.printf("Это не правильный формат: %s\n", str);
    }
}
