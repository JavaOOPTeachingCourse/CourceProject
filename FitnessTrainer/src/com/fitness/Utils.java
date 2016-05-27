package com.fitness;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vmorozov on 23.05.2016.
 */
public class Utils {
    private Person person;
    private Exercise exercise;
    private double exerciseWeight;
    private int exerciseRepeat;
    private double work;

    public Utils(Person person, Exercise exercise) {
        this.person = person;
        this.exercise = exercise;
        this.exerciseRepeat = exercise.getRepeatModExercises() + person.getFocus().getRepeatModFocus() + person.getExpiriense().getRepeatModExpiriense();
        this.exerciseWeight = exercise.getWeightModExercises() * person.getWeight() * (100 - person.getPersentFat()) / 100 / 100 + (person.getFocus().getWeightModFocus() + person.getExpiriense().getWeightModExpiriense()) * exercise.getWeightModExercises() * person.getWeight() * (100 - person.getPersentFat()) / 100 / 100 / 100;
        this.work = exerciseWeight * exerciseRepeat;

    }

    @Override
    public String toString() {
        return
                "Упражнения на " + exercise.getName() + " необходимо выполнять с весом " + exerciseWeight +
                        " кг, на " + exerciseRepeat + " повторений";
    }
}
