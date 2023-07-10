package javaErrorException.HomeWork_003;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();
        String newFileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("lastName") + ".txt";
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : data.keySet()) {
            stringBuilder.append(data.get(str));
            stringBuilder.append(" ");
        }

        System.out.println(data);
        String filePath = newFileName;
        writeFile.writeData(String.valueOf(stringBuilder), filePath);
    }
}