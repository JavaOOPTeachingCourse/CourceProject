package com.fitness;

import java.io.Serializable;

/**
 * Created by vmorozov on 23.05.2016.
 */
public enum Expiriense implements Serializable{
    BEGINNER(-20, -2, "новичок"),
    PROFESSIONAL(0, 0, "профессионал"),
    EXPERT(20, 2, "эксперт");

    private int weightModExpiriense;
    private int repeatModExpiriense;
    private String name;

    Expiriense(int weightModExpiriense, int repeatModExpiriense, String name) {
        this.weightModExpiriense = weightModExpiriense;
        this.repeatModExpiriense = repeatModExpiriense;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightModExpiriense() {
        return weightModExpiriense;
    }

    public void setWeightModExpiriense(int weightModExpiriense) {
        this.weightModExpiriense = weightModExpiriense;
    }

    public int getRepeatModExpiriense() {
        return repeatModExpiriense;
    }

    public void setRepeatModExpiriense(int repeatModExpiriense) {
        this.repeatModExpiriense = repeatModExpiriense;
    }
    public static Expiriense valueOf (int value){
        switch (value) {
            case 0:
                return Expiriense.BEGINNER;

            case 1:
                return Expiriense.EXPERT;

            case 2:
                return Expiriense.PROFESSIONAL;

            default:
                return Expiriense.BEGINNER;
        }
    }
}
