package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2Task1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                float num = Float.parseFloat(bufferedReader.readLine());
                System.out.printf("Введённое число равно: %f\n", num);
                break;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
        }
    }
}