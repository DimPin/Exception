package javaErrorException.HomeWork_003;

import java.util.HashMap;

public class ParsData {
    public HashMap<String, Object> parsInputData() {
        InputData inputData = new InputData();
        String[] data = inputData.enterData();
        HashMap<String, Object> dataHashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : data) {
            if (str.length() == 1) {
                if (str.equals("f") || str.equals("m")) {
                    dataHashMap.put("gender", str);
                } else {
                    try {
                        throw new GenderException();
                    } catch (GenderException e) {
                        e.genderException(str);
                    }
                }
            } else if (str.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
                String[] arrayDate = str.split("\\.");
                boolean flag = true;
                if (Integer.parseInt(arrayDate[0]) < 0 ||
                        Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 ||
                        Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 0 ||
                        Integer.parseInt(arrayDate[1]) > 2022) {
                    try {
                        throw new DataException();
                    } catch (DataException e) {
                        e.dataException(str);
                    }
                } else {
                    if (Integer.parseInt(arrayDate[2]) % 4 == 0) {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 30) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }
                    } else {
                        if (Integer.parseInt(arrayDate[1]) == 1 ||
                                Integer.parseInt(arrayDate[1]) == 3 ||
                                Integer.parseInt(arrayDate[1]) == 5 ||
                                Integer.parseInt(arrayDate[1]) == 7 ||
                                Integer.parseInt(arrayDate[1]) == 9 ||
                                Integer.parseInt(arrayDate[1]) == 10 ||
                                Integer.parseInt(arrayDate[1]) == 12) {
                            if (Integer.parseInt(arrayDate[0]) < 32) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[2]) == 2) {
                            if (Integer.parseInt(arrayDate[0]) < 29) {
                                flag = false;
                            }
                        } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                                Integer.parseInt(arrayDate[1]) == 6 ||
                                Integer.parseInt(arrayDate[1]) == 8 ||
                                Integer.parseInt(arrayDate[1]) == 11) {
                            if (Integer.parseInt(arrayDate[0]) < 31) {
                                flag = false;
                            }
                        }

                    }
                    if (!flag) {
                        dataHashMap.put("date", str);
                    } else
                        try {
                            throw new DataException();
                        } catch (DataException e) {
                            e.dataException(str);
                        }
                }

            } else if (str.matches("[0-9]+")) {
                dataHashMap.put("tel", str);
            } else if (str.matches("[A-Za-z]+")) {
                stringBuilder.append(str + " ");
            } else {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    e.dataException(str);
                }
            }
        }

        String[] fullName = String.valueOf(stringBuilder).split(" ");
        if (fullName.length == 3) {
            dataHashMap.put("lastName", fullName[0]);
            dataHashMap.put("firstName", fullName[1]);
            dataHashMap.put("patronymic", fullName[2]);
        }
        return dataHashMap;
    }
}
