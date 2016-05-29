package com.fitness;

/**
 * Created by vmorozov on 23.05.2016.
 */
public enum Focus {
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
}