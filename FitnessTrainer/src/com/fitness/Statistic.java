package com.fitness;

import java.io.File;
import java.io.Serializable;
import java.io.StringReader;
import java.util.List;
import java.util.Random;

/**
 * Created by Z on 5/27/2016.
 */
public class Statistic implements Serializable {
    private long dateTime;
    private Exercise typeOfExercise;
    private double exerciseWeight;
    private int exerciseCount;
    private double work;
    private static final String TYPE = "Statistic";


    public long getDateTime() {
        return dateTime;
    }

    public Statistic setDateTime(long dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public Exercise getTypeOfExercise() {
        return typeOfExercise;
    }

    public Statistic setTypeOfExercise(Exercise typeOfExercise) {
        this.typeOfExercise = typeOfExercise;
        return this;
    }

    public double getExerciseWeight() {
        return exerciseWeight;
    }

    public Statistic setExerciseWeight(double exerciseWeight) {
        this.exerciseWeight = exerciseWeight;
        return this;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public Statistic setExerciseCount(int exerciseCount) {
        this.exerciseCount = exerciseCount;
        return this;
    }

    public double getWork() {
        return work;
    }

    public Statistic setWork() {
        this.work = exerciseWeight * exerciseCount;
        return this;
    }

    public static Exercise valueOf(int value) {
        switch (value) {
            case 0:
                return Exercise.ARM;

            case 1:
                return Exercise.BODY;

            case 2:
                return Exercise.LEGS;

            default:
                return Exercise.ARM;
        }
    }

    public static String toCSV(List<Statistic> list) {
        StringBuilder sb = new StringBuilder();

        for (Statistic statistic : list) {
            sb.append(TYPE+FileUtils.DELIMITER+
                    statistic.getDateTime()+FileUtils.DELIMITER+
            statistic.getTypeOfExercise()+FileUtils.DELIMITER+
            statistic.getExerciseWeight()+FileUtils.DELIMITER+
            statistic.getExerciseCount()+FileUtils.DELIMITER+
            statistic.getWork()+'\n');
        }
return sb.toString();
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "dateTime=" + Utils.getDate(dateTime, "dd.MM.yyyy") +
                ", typeOfExercise=" + typeOfExercise +
                ", exerciseWeight=" + exerciseWeight +
                ", exerciseCount=" + exerciseCount +
                ", work=" + work +
                '}' + '\n';
    }
}
