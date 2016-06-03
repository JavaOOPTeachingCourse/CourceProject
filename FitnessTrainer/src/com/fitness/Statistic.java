package com.fitness;

import java.io.Serializable;
import java.util.Random;

/**
 * Created by Z on 5/27/2016.
 */
public class Statistic implements Serializable{
    private long dateTime;
    private Exercise typeOfExercise;
    private double exerciseWeight;
    private int exerciseCount;
    private double work;



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
        this.work = exerciseWeight*exerciseCount;
        return this;
    }
    public static Exercise valueOf (int value){
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
