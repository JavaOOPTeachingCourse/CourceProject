package com.fitness;


import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class FileUtils {
    private static final String DELIMITER = "\\|";
    private static final String DELIMITER_LINE = "\\\n";
    private static final String FILENAME = "state.txt";

    public static boolean checkName(String name) {
        return exists(name);

    }

    public static List<Person> loadState() {
        ObjectInputStream in = null;
        boolean whileReason = true;
        List<Person> result = new ArrayList<Person>();
        try {
            in = new ObjectInputStream(new FileInputStream(FILENAME));
            System.out.println(in.available());
            while (whileReason) {
                try {
                    result = (List) in.readObject();
                } catch (ClassNotFoundException e) {

                    e.printStackTrace();
                } catch (EOFException eof) {
                    whileReason = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void saveState(List<Person> person) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(FILENAME));
            out.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void updateFile(String fileName, String text) {
        exists(fileName);
        StringBuilder sb = new StringBuilder();
        String oldFile = readFromFile(fileName);
        sb.append(oldFile);
        sb.append(text);
        writeToFile(fileName, sb.toString());
    }

    public static void writeToFile(String fileName, String text) {
        File file = new File(fileName);

        try {

            if (!exists(fileName)) {
                file.createNewFile();
            }


            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {

                out.print(text);
            } finally {

                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFromFile(String fileName) {
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        exists(fileName);

        try {

            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {

                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {

                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return sb.toString();
    }

    private static boolean exists(String fileName) {
        File file = new File(fileName);
        boolean result = false;
        if (!file.exists()) {
            result = false;

        } else {
            result = true;
        }
        return result;

    }

    public static String[] parseStringLine(String text) {
        return text.split(DELIMITER_LINE);
    }

    public static String[] parseString(String text) {
        return text.split(DELIMITER);
    }

    public static boolean checkLoadFile() {
        return (exists("load.txt")) ? true : false;
    }


    public static void main(String[] args) {
        System.out.println(checkName("alex"));
        writeToFile("Alex", "Alex|80|PUMP_UP");
        //updateFile("Alex","FGHBNM");
        System.out.println(readFromFile("Alex"));
        System.out.println(parseString(readFromFile("Alex")).length);
        for (String alex : parseString(readFromFile("Alex"))) {
            System.out.println(alex);
        }
    }
}
