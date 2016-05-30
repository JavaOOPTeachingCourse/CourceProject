package com.fitness;

import java.io.Serializable;
import java.util.Random;
import java.util.List;

/**
 * Created by vmorozov on 23.05.2016.
 */
public class Person implements Serializable{
    private String name;
    private double weight;
    private double persentFat;
    private Focus focus;
    private Expiriense expiriense;
    private List<Exercise> exercise;
    private List<Statistic> stat;

    public Person(String name, double weight, double persentFat) {
        this.name = name;
        this.weight = weight;
        this.persentFat = persentFat;
        Random rnd = new Random();
        switch (rnd.nextInt(3)) {
            case 0:
                this.setFocus(Focus.FAT_OFF);
                break;
            case 1:
                this.setFocus(Focus.MUSCLE_GROWHT);
                break;
            case 2:
                this.setFocus(Focus.STRENGTH_UP);
                break;
            default:
                this.setFocus(Focus.FAT_OFF);
        }
        switch (rnd.nextInt(3)) {
            case 0:
                this.setExpiriense(Expiriense.BEGINNER);
                break;
            case 1:
                this.setExpiriense(Expiriense.EXPERT);
                break;
            case 2:
                this.setExpiriense(Expiriense.PROFESSIONAL);
                break;
            default:
                this.setExpiriense(Expiriense.BEGINNER);
        }
    }

    public List<Exercise> getExercise() {
        return exercise;
    }

    public void setExercise(List<Exercise> exercise) {
        this.exercise = exercise;
    }

    public List<Statistic> getStat() {
        return stat;
    }

    public void setStat(List<Statistic> stat) {
        this.stat = stat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPersentFat() {
        return persentFat;
    }

    public void setPersentFat(double persentFat) {
        this.persentFat = persentFat;
    }

    public Focus getFocus() {
        return focus;
    }

    public void setFocus(Focus focus) {
        this.focus = focus;
    }

    public Expiriense getExpiriense() {
        return expiriense;
    }

    public void setExpiriense(Expiriense expiriense) {
        this.expiriense = expiriense;
    }


    public void weightExeption() {
        if ((this.weight - this.weight * this.persentFat / 100) < 40) {
            System.out.println("Возможно вы указали неверный вес или процент жира. Мы не даем гарантии что результат правильный");
        }

    }

    /*@Override
    public String toString() {
        return "Привет " + name + " учитывая твое физическое состояние, то что ты " + expiriense.getName() +
                ", и твое желание " + focus.getName() + "\n" +
                ", мы рекомендуем выполнять выбранные тобой упражнения со следующей нагрузкой:";
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", persentFat=" + persentFat +
                ", focus=" + focus +
                ", expiriense=" + expiriense +
                ", exercise=" + exercise +
                ", stat=" + stat +
                '}' + '\n';
    }
}
