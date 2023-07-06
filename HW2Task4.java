

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2Task4 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        try {
            String result = bufferedReader.readLine();
            if (result.equals("")) {
                throw new RuntimeException("Пустуая строка");
            }
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}