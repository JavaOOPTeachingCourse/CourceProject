package com.fitness;

/**
 * Created by Z on 5/27/2016.
 */
public class Statistic {
    private long dateTime;
    private Exercise typeOfExercise;
    private double exerciseWeight;
    private int exerciseCount;
    private double work;

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
