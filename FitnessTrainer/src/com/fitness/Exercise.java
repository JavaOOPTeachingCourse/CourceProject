package com.fitness;
/**
 * Created by vmorozov on 23.05.2016.
 */
public enum Exercise {
    ARM(40, 12, "руки"),
    LEGS(120, 8, "ноги"),
    BODY(100, 10, "тело");


    private int weightModExercises;
    private int repeatModExercises;
    private String name;


    Exercise(int weightModExercises, int repeatModExercises, String name) {
        this.weightModExercises = weightModExercises;
        this.repeatModExercises = repeatModExercises;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightModExercises() {
        return weightModExercises;
    }

    public void setWeightModExercises(int weightModExercises) {
        this.weightModExercises = weightModExercises;
    }

    public int getRepeatModExercises() {
        return repeatModExercises;
    }

    public void setRepeatModExercises(int repeatModExercises) {
        this.repeatModExercises = repeatModExercises;
    }


}

