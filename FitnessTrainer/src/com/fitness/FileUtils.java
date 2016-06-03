package com.fitness;


import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileUtils {
    public static final String DELIMITER = "|";
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

    public static void writePersonsToFile(List<Person> list, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Person person : list) {
                writePerson(person, writer);
                writeExercise(person, writer);
                writeStatistics(person, writer);
            }
        }
    }

    public static List<Person> readPersonsFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readPersons(reader);
        }

    }

    private static List<Person> readPersons(BufferedReader reader) throws IOException {
        List<Person> result = new ArrayList<Person>();
        String line;
        Person person = new Person();
        while ((line = reader.readLine()) != null) {
            switch (checkTypeOfString(line)) {
                case "Person":
                    person = addPerson(line,person);
                    break;
                case "Exercise":
                    person = addExerciseToPerson(line, person);
                    break;
                case "Statistic":
                    person = addStatisticToPerson(line, person);
                    break;
                case "": result.add(person);
                    break;
            }



        }
        return result;
    }

    private static Person addStatisticToPerson(String line, Person person) {
        String [] temp = parseStatistic(line);
        List<Statistic> list = new ArrayList<Statistic>();
        list.add(new Statistic()
                .setDateTime(Long.valueOf(temp[1]))
                .setTypeOfExercise(Exercise.valueOfString(temp[2]))
                .setExerciseWeight(Double.valueOf(temp[3]))
                .setExerciseCount(Integer.valueOf(temp[4])).setWork());
        return person.setStat(list);
    }

    private static Person addExerciseToPerson(String line, Person person) {
        String[] temp = parseExercise(line);
        List<Exercise> list = new ArrayList<Exercise>();

        for (String s : temp) {
            list.add(Exercise.valueOfString(s));
        }
        return person.setExercise(list);
    }

    private static Person addPerson(String line, Person person) {
        String[] temp = parsePerson(line);
        person
                .setName(temp[1])
                .setWeight(Double.valueOf(temp[2]))
                .setPersentFat(Double.valueOf(temp[3]))
                .setFocus(Focus.valueOfString(temp[4])).setExpiriense(Expiriense.valueOfString(temp[5]));

        return person;
    }

    private static String[] parseStatistic(String line) {
        return line.split(FileUtils.DELIMITER);
    }

    private static String[] parseExercise(String line) {

        return line.split(FileUtils.DELIMITER);
    }

    private static String[] parsePerson(String line) {

        return line.split(FileUtils.DELIMITER);
    }

    private static String checkTypeOfString(String line) {
        String[] result = line.split(FileUtils.DELIMITER);
        return result[0];
    }

    private static void writeStatistics(Person person, PrintWriter writer) {
        writer.println(Statistic.toCSV(person.getStat()));
    }

    private static void writeExercise(Person person, PrintWriter writer) {
        writer.println(Exercise.toCSV(person.getExercise()));
    }

    private static void writePerson(Person person, PrintWriter writer) {
        writer.println(person.toCSV());
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
