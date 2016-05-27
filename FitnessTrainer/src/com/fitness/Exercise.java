package com.fitness;

public enum Exercise {
    ARM(40, 12, "ARM"),
    LEGS(120, 8, "LEGS"),
    BODY(100, 10, "BODY");


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

