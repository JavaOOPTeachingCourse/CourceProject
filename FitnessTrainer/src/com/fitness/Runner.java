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
        System.out.println("---Generated objects---");
        System.out.println(list);

        //Write Persons list to file
        try {
            System.out.println("---Write objects into file---");
            FileUtils.writePersonsToFile(list, "persons.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Load Persons list from file
        List<Person> listReadFromFile=null;
        try {
            System.out.println("---Objects from file---");
            listReadFromFile = FileUtils.readPersonsFromFile("persons.csv");
            System.out.println(listReadFromFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Filtering list by work field all records less then 300 and more than 100
        for (Person person : listReadFromFile) {
            person.setStat(StatisticPredicate.filter(person.getStat(),StatisticPredicate.workLessThen(300).and(StatisticPredicate.workMoreThen(100))));
        }
        System.out.println("---Filtered object---");
        System.out.println(listReadFromFile);

        //Sorting list by work field desc
        for (Person person : listReadFromFile) {
            Collections.sort(person.getStat(),StatisticComparator.getComparator(StatisticComparator.WORK_REVERS));
        }
        System.out.println("---Sorted object---");
        System.out.println(listReadFromFile);

        //Serialise objects
        System.out.println("---Write object state---");
FileUtils.saveState(listReadFromFile);

        System.out.println("---Load object state---");
        List<Person> listBynaryFromFile = FileUtils.loadState();

        //Print loaded objects
        System.out.println(listBynaryFromFile);






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







