package com.fitness;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vmorozov on 23.05.2016.
 */
public class Runner {

    public static void main(String[] args) {

        /*Person alex = new Person();
        alex.setName("Alex");
        alex.setWeight(90);
        alex.setPersentFat(10);
        alex.setFocus(Focus.MUSCLE_GROWHT);
        alex.setExpiriense(Expiriense.PROFESSIONAL);
        alex.weightExeption();
        System.out.println(alex);
        List<Exercise> exercises = new ArrayList<>();
        exercises.add(Exercise.ARM);
        exercises.add(Exercise.BODY);
        exercises.add(Exercise.LEGS);


        for (int i = 0; i < exercises.size(); i++) {
            Utils utils = new Utils(alex, exercises.get(i));
            System.out.println(utils);

        }*/
double test = 1.0123456789;
        BigDecimal bd = new BigDecimal(test);
        System.out.println(bd.setScale(2).doubleValue());

    }
}







