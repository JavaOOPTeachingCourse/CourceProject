package com.fitness;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
/*double test = 1.0123456789;
        BigDecimal bd = new BigDecimal(test);
        System.out.println(bd.setScale(2).doubleValue());*/
        List<Person> list = generatePersonList();
        list = generateExercise(list);
        list = generateStatistic(list);
        System.out.println("list = " + list);
        /*for (Person person : list) {
            System.out.println(Utils.calculateExercise(person));
        }*/
    }
public static List<Person> generateExercise(List<Person> person){
    List<Exercise> exercise = new ArrayList<Exercise>();
    exercise.add(Exercise.ARM);
    exercise.add(Exercise.BODY);
    exercise.add(Exercise.LEGS);
    for (Person pers : person) {
        pers.setExercise(exercise);
    }
    return person;
}
    public static  List<Person> generateStatistic (List<Person> person){
        List<Statistic> stat = new ArrayList<Statistic>();
        Random rnd = new Random();
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","01.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","03.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","05.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","07.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","09.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","11.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","13.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","15.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","17.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","18.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","21.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","22.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","24.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","26.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","27.05.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","25.04.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","23.04.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","21.04.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","19.04.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","17.04.2016"),rnd.nextInt(60),rnd.nextInt(20)));
stat.add(new Statistic(Utils.getTime("dd.MM.yyyy","15.04.2016"),rnd.nextInt(60),rnd.nextInt(20)));
        for (Person person1 : person) {
            person1.setStat(stat);
        }
        return person;
    }
    public static List<Person> generatePersonList() {
        List<Person> result = new ArrayList<Person>();
        Random rnd = new Random();
        result.add(new Person("Alex", 25, rnd.nextInt(30)));
        result.add(new Person("Bob", 20, rnd.nextInt(30)));
        result.add(new Person("Jack", 55, rnd.nextInt(30)));
        result.add(new Person("Franck", 35, rnd.nextInt(30)));
        result.add(new Person("Hank", 42, rnd.nextInt(30)));
        result.add(new Person("Walli", 49, rnd.nextInt(30)));
        result.add(new Person("Wallter", 60, rnd.nextInt(30)));
        result.add(new Person("Greg", 63, rnd.nextInt(30)));
        result.add(new Person("Make", 23, rnd.nextInt(30)));
        result.add(new Person("Lin", 37, rnd.nextInt(30)));
        result.add(new Person("Lusy", 48, rnd.nextInt(30)));
        result.add(new Person("Lincoln", 61, rnd.nextInt(30)));
        result.add(new Person("Litle", 15, rnd.nextInt(30)));
        result.add(new Person("Oren", 18, rnd.nextInt(30)));
        result.add(new Person("Jordg", 22, rnd.nextInt(30)));
        result.add(new Person("Noi", 90, rnd.nextInt(30)));
        result.add(new Person("Asus", 49, rnd.nextInt(30)));
        result.add(new Person("Lol", 87, rnd.nextInt(30)));
        result.add(new Person("Kkkk", 27, rnd.nextInt(30)));
        result.add(new Person("Piter", 27, rnd.nextInt(30)));

        return result;
    }
}







