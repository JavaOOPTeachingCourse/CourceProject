package com.fitness;

import java.io.Serializable;
import java.util.List;


public class Person implements Serializable {
    private String name;
    private double weight;
    private double persentFat;
    private Focus focus;
    private Expiriense expiriense;
    private List<Exercise> exercise;
    private List<Statistic> stat;
    private static final String TYPE = "Person";

    public List<Exercise> getExercise() {
        return exercise;
    }

    public Person setExercise(List<Exercise> exercise) {
        this.exercise = exercise;
        return this;
    }

    public List<Statistic> getStat() {
        return stat;
    }

    public Person setStat(List<Statistic> stat) {
        this.stat = stat;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Person setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public double getPersentFat() {
        return persentFat;
    }

    public Person setPersentFat(double persentFat) {
        this.persentFat = persentFat;
        return this;
    }

    public Focus getFocus() {
        return focus;
    }

    public Person setFocus(Focus focus) {
        this.focus = focus;
        return this;
    }

    public Expiriense getExpiriense() {
        return expiriense;
    }

    public Person setExpiriense(Expiriense expiriense) {
        this.expiriense = expiriense;
        return this;
    }


    public void weightExeption() {
        if ((this.weight - this.weight * this.persentFat / 100) < 40) {
            System.out.println("Возможно вы указали неверный вес или процент жира. Мы не даем гарантии что результат правильный");
        }

    }

    public String toCSV() {
        return
                this.TYPE + FileUtils.DELIMITER +
                        this.getName() + FileUtils.DELIMITER +
                        this.getWeight() + FileUtils.DELIMITER +
                        this.getPersentFat() + FileUtils.DELIMITER +
                        this.getFocus() + FileUtils.DELIMITER +
                        this.getExpiriense();

    }


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
