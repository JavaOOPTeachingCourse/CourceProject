package com.fitness;


import java.util.Collections;
import java.util.List;


import static com.fitness.Utils.generateExercise;
import static com.fitness.Utils.generatePersonList;
import static com.fitness.Utils.generateStatistic;


public class Runner {

    public static void main(String[] args) {


        List<Person> list = generatePersonList();
        list = generateExercise(list);
        list = generateStatistic(list);
        //System.out.println("list = " + list);

        //Example calculate exercise for person[0]
        System.out.println(Utils.calculateExercise(list.get(0)));

        //Example sorting statistic for person[0]
        List<Statistic> sortedStatistic = list.get(0).getStat();
        Collections.sort(sortedStatistic, StatisticComparator.getComparator(StatisticComparator.DATE_TIME, StatisticComparator.TYPE_OF_EXERCISE));
        System.out.println("sortedStatistic = " + sortedStatistic);

        //Example filtering for person[0]
        List<Statistic> filteredStatistic = StatisticPredicate.filter(list.get(0).getStat(), StatisticPredicate.dateMoreThen(Utils.getTime("dd.MM.yyyy", "25.05.2016")).and(StatisticPredicate.exerciseWeightMoreThen(20.)));
        System.out.println("filteredStatistic = " + filteredStatistic);


    }

}







