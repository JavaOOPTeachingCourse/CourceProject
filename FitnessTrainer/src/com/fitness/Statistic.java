package com.fitness;

import java.util.Random;

/**
 * Created by Z on 5/27/2016.
 */
public class Statistic {
    private long dateTime;
    private Exercise typeOfExercise;
    private double exerciseWeight;
    private int exerciseCount;
    private double work;

    public Statistic(long dateTime, double exerciseWeight, int exerciseCount) {
        this.dateTime = dateTime;
        this.exerciseWeight = exerciseWeight;
        this.exerciseCount = exerciseCount;
        this.work=exerciseWeight*exerciseCount;
        Random rnd = new Random();
        switch (rnd.nextInt(3)){
            case 0: this.typeOfExercise=Exercise.ARM;
                break;
            case 1: this.typeOfExercise=Exercise.BODY;
                break;
            case 2: this.typeOfExercise=Exercise.LEGS;
                break;
            default: this.typeOfExercise=Exercise.ARM;
        }
    }

    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public Exercise getTypeOfExercise() {
        return typeOfExercise;
    }

    public void setTypeOfExercise(Exercise typeOfExercise) {
        this.typeOfExercise = typeOfExercise;
    }

    public double getExerciseWeight() {
        return exerciseWeight;
    }

    public void setExerciseWeight(double exerciseWeight) {
        this.exerciseWeight = exerciseWeight;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public void setExerciseCount(int exerciseCount) {
        this.exerciseCount = exerciseCount;
    }

    public double getWork() {
        return work;
    }

    public void setWork(double work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "dateTime=" + dateTime +
                ", typeOfExercise=" + typeOfExercise +
                ", exerciseWeight=" + exerciseWeight +
                ", exerciseCount=" + exerciseCount +
                ", work=" + work +
                '}';
    }
}
