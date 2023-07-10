package javaErrorException.HomeWork_003;

public class GenderException extends Exception {
    public GenderException() {
    }

    public void genderException(String i) {
        System.out.println("Exception: GenderNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}
