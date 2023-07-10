package javaErrorException.HomeWork_003;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку через пробел");
            System.out.println("Cтрока должна содержать Фамилия Имя Отчество, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m");
            String data = in.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("Вы ввели не все данные, пожалуйста, повторите попытку");
            } else {
                System.out.println("Вы ввели дополнительные данные, пожалуйста, повторите попытку");
            }
        }
    }
}
