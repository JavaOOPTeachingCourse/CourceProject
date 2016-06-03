package com.fitness;


import java.io.IOException;
import java.util.Collections;
import java.util.List;




public class Runner {

    public static void main(String[] args) {

        //Generate Person list
        List<Person> list = Utils.generatePersonList();
        //Generate Exercise for Persons
        list = Utils.generateExercise(list);
        //Generate Statistic for Persons
        list = Utils.generateStatistic(list);
        //Print Person list
        System.out.println(list);

        //Write Persons list to file
        try {
            FileUtils.writePersonsToFile(list,"persons.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Load Persons list from file
        try {
            List<Person> listReadFromFile = FileUtils.readPersonsFromFile("persons.csv");
            System.out.println("---------------------------------------------------------");
            System.out.println(listReadFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }



        //List<Person> list = FileUtils.loadState();
        /*List<Person> list = generatePersonList();
        list = generateExercise(list);
        list = generateStatistic(list);
        FileUtils.saveState(list);*/
        //System.out.println("list = " + list);

        //Example calculate exercise for person[0]
        //System.out.println(Utils.calculateExercise(list.get(0)));

        //Example sorting statistic for person[0]
        //List<Statistic> sortedStatistic = list.get(0).getStat();
        //Collections.sort(sortedStatistic, StatisticComparator.getComparator(StatisticComparator.DATE_TIME, StatisticComparator.TYPE_OF_EXERCISE));
        //System.out.println("sortedStatistic = " + sortedStatistic);

        //Example filtering for person[0]
        //List<Statistic> filteredStatistic = StatisticPredicate.filter(list.get(0).getStat(), StatisticPredicate.dateMoreThen(Utils.getTime("dd.MM.yyyy", "25.05.2016")).and(StatisticPredicate.exerciseWeightMoreThen(20.)));
        //System.out.println("filteredStatistic = " + filteredStatistic);
        //FileUtils.saveState(list);



    }

}







