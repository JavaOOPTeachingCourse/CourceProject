package com.fitness;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vmorozov on 23.05.2016.
 */
public class Person {
    public Person() {
    }

    private String name;
   private double weight;
    private double persentFat;
   private Focus focus;
    private Expiriense expiriense;
    private Exercise exercise;

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

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void  weightExeption(){
        if ((this.weight-this.weight*this.persentFat/100)<40){
            System.out.println("Возможно вы указали неверный вес или процент жира. Мы не даем гарантии что результат правильный");
        }

    }

    @Override
    public String toString() {
        return  "Привет " + name + " учитывая твое физическое состояние, то что ты "+ expiriense.getName()+
                ", и твое желание " + focus.getName() + "\n" +
                ", мы рекомендуем выполнять выбранные тобой упражнения со следующей нагрузкой:";
    }
}
