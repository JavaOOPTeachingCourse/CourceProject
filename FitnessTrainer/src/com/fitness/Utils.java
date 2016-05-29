package com.fitness;

import java.util.ArrayList;
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

}
