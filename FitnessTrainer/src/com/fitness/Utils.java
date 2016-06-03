package com.fitness;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


public class Utils {

    public static String calculateExercise(Person person) {
        int exerciseRepeat;
        double exerciseWeight;
        StringBuilder sb = new StringBuilder();
        List<Exercise> exerciseList = person.getExercise();
        for (Exercise exercise : exerciseList) {
            exerciseRepeat = exercise.getRepeatModExercises() + person.getFocus().getRepeatModFocus() + person.getExpiriense().getRepeatModExpiriense();
            exerciseWeight = exercise.getWeightModExercises() * person.getWeight() * (100 - person.getPersentFat()) / 100 / 100 + (person.getFocus().getWeightModFocus() + person.getExpiriense().getWeightModExpiriense()) * exercise.getWeightModExercises() * person.getWeight() * (100 - person.getPersentFat()) / 100 / 100 / 100;
            sb.append("Упражнения на " + exercise.getName() + " необходимо выполнять с весом " + exerciseWeight +
                    " кг, на " + exerciseRepeat + " повторений" + '\n');
        }
        return sb.toString();
    }

    public static long getTime(String dateFormat, String date) {
        DateFormat dateformat = new SimpleDateFormat(dateFormat);
        long timeInMs = 0;
        try {
            timeInMs = dateformat.parse(date).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timeInMs;
    }

    public static String getDate(long dateLong, String dateFormat) {
        Date date = new Date(dateLong);
        DateFormat dateformat = new SimpleDateFormat(dateFormat);
        return dateformat.format(date);
    }

    public static List<Person> generateExercise(List<Person> person) {
        List<Exercise> exercise = new ArrayList<Exercise>();
        exercise.add(Exercise.ARM);
        exercise.add(Exercise.BODY);
        exercise.add(Exercise.LEGS);
        for (Person pers : person) {
            pers.setExercise(exercise);
        }
        return person;
    }

    public static List<Person> generateStatistic(List<Person> person) {
        List<Statistic> result = new ArrayList<Statistic>();
        Random rnd = new Random();
        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "01.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "03.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "05.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "07.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "09.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "11.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "13.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "15.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "17.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "18.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "21.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "22.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "24.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "26.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "27.05.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "25.04.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "23.04.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "21.04.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "19.04.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());

        result.add(new Statistic().setDateTime(Utils.getTime("dd.MM.yyyy", "17.04.2016"))
                .setExerciseWeight(rnd.nextInt(60))
                .setExerciseCount(rnd.nextInt(20))
                .setTypeOfExercise(Statistic.valueOf(rnd.nextInt(3)))
                .setWork());


        for (Person person1 : person) {
            person1.setStat(result);
        }
        return person;
    }

    public static List<Person> generatePersonList() {
        List<Person> result = new ArrayList<Person>();
        Random rnd = new Random();

        result.add(new Person()
                .setName("Alex")
                .setWeight(25.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Bob")
                .setWeight(20.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Jack")
                .setWeight(55.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Franck")
                .setWeight(35.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Hank")
                .setWeight(42.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Walli")
                .setWeight(49.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Wallter")
                .setWeight(60.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Greg")
                .setWeight(63.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Make")
                .setWeight(23.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Lin")
                .setWeight(37.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Lusy")
                .setWeight(48.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Lincoln")
                .setWeight(61.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Litle")
                .setWeight(15.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Oren")
                .setWeight(18.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Jordg")
                .setWeight(22.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Noi")
                .setWeight(90.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Asus")
                .setWeight(49.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Lol")
                .setWeight(87.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Kkkk")
                .setWeight(27.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));

        result.add(new Person()
                .setName("Piter")
                .setWeight(27.)
                .setPersentFat(rnd.nextInt(30))
                .setExpiriense(Expiriense.valueOf(rnd.nextInt(3)))
                .setFocus(Focus.valueOf(rnd.nextInt(3))));



        return result;
    }
}
