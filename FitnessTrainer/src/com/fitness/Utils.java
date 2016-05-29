package com.fitness;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vmorozov on 23.05.2016.
 */
public class Utils {

public static String calculateExercise(Person person){
    int exerciseRepeat;
    double exerciseWeight;
    StringBuilder sb = new StringBuilder();
    List<Exercise> exerciseList = person.getExercise();
    for (Exercise exercise : exerciseList) {
        exerciseRepeat = exercise.getRepeatModExercises() + person.getFocus().getRepeatModFocus() + person.getExpiriense().getRepeatModExpiriense();
        exerciseWeight = exercise.getWeightModExercises() * person.getWeight() * (100 - person.getPersentFat()) / 100 / 100 + (person.getFocus().getWeightModFocus() + person.getExpiriense().getWeightModExpiriense()) * exercise.getWeightModExercises() * person.getWeight() * (100 - person.getPersentFat()) / 100 / 100 / 100;
    sb.append( "Упражнения на " + exercise.getName() + " необходимо выполнять с весом " + exerciseWeight +
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

}
