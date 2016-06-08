package com.fitness;

import java.io.Serializable;

/**
 * Created by vmorozov on 23.05.2016.
 */
public enum Focus implements Serializable {
    FAT_OFF(-20, 4, "похудеть"),
    STRENGTH_UP(+20, -2, "стать сильнее"),
    MUSCLE_GROWHT(0, 0, "нарастить мышцы");
    private int weightModFocus;
    private int repeatModFocus;
    private String name;

    Focus(int weightModFocus, int repeatModFocus, String name) {
        this.weightModFocus = weightModFocus;
        this.repeatModFocus = repeatModFocus;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepeatModFocus() {
        return repeatModFocus;
    }

    public void setRepeatModFocus(int repeatModFocus) {
        this.repeatModFocus = repeatModFocus;
    }

    public int getWeightModFocus() {
        return weightModFocus;
    }

    public void setWeightModFocus(int weightModFocus) {
        this.weightModFocus = weightModFocus;
    }

    public  static Focus valueOf(int value) {
        switch (value) {
            case 0:
                return Focus.FAT_OFF;

            case 1:
                return Focus.MUSCLE_GROWHT;

            case 2:
                return Focus.STRENGTH_UP;

            default:
                return Focus.FAT_OFF;
        }
    }

    public  static Focus valueOfString (String value){
        Focus result=null;
        switch (value){
            case "MUSCLE_GROWHT": result= Focus.MUSCLE_GROWHT;
                break;
            case "STRENGTH_UP" : result= Focus.STRENGTH_UP;
                break;
            case "FAT_OFF": result= Focus.FAT_OFF;
                break;
        }
    return result;
    }
}
