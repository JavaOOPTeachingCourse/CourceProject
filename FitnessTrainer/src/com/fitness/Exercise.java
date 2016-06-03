package com.fitness;

import java.io.Serializable;
import java.util.List;

public enum Exercise implements Serializable{
    ARM(40, 12, "ARM"),
    LEGS(120, 8, "LEGS"),
    BODY(100, 10, "BODY");


    private int weightModExercises;
    private int repeatModExercises;
    private String name;
    private static final String TYPE="Exercise";


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
    public static String toCSV (List<Exercise> list){
        StringBuilder sb = new StringBuilder();
        sb.append(TYPE+FileUtils.DELIMITER);
        for (Exercise exercise : list) {
            sb.append(exercise.getName()+FileUtils.DELIMITER);
        }
return sb.toString();
    }

public static Exercise valueOfString(String value){
    Exercise result = null;
    switch (value){
        case "ARM": result = Exercise.ARM;
        case "LEGS" : result = Exercise.LEGS;
        case "BODY" : result = Exercise.BODY;
    }
    return result;
}

}

